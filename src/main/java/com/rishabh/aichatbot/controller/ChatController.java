
package com.rishabh.aichatbot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rishabh.aichatbot.dto.ChatRequest;
import com.rishabh.aichatbot.dto.ChatResponse;
import com.rishabh.aichatbot.dto.ChatHistoryResponse;
import com.rishabh.aichatbot.service.ChatService;
import com.rishabh.aichatbot.service.ConversationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;
    private final ConversationService conversationService;

    public ChatController(
            ChatService chatService,
            ConversationService conversationService) {

        this.chatService = chatService;
        this.conversationService = conversationService;
    }

    @PostMapping("/message")
    public ChatResponse sendMessage(@Valid @RequestBody ChatRequest request) {

        conversationService.getMyConversation(request.getConversationId());

        String reply = chatService.generateReply(
                request.getMessage(),
                request.getConversationId()
        );

        conversationService.generateTitleIfNew(
                request.getConversationId(),
                request.getMessage()
        );

        return new ChatResponse(reply);
    }

    @PostMapping("/regenerate/{conversationId}")
    public ChatResponse regenerateResponse(
            @PathVariable String conversationId) {

        conversationService.getMyConversation(conversationId);

        String reply = chatService.regenerateReply(conversationId);

        return new ChatResponse(reply);
    }

    @GetMapping("/history/{conversationId}")
    public List<ChatHistoryResponse> getChatHistory(
            @PathVariable String conversationId) {

        conversationService.getMyConversation(conversationId);

        return chatService.getChatHistory(conversationId);
    }
}
