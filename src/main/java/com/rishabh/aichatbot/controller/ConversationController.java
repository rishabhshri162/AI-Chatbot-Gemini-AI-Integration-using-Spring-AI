package com.rishabh.aichatbot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.aichatbot.entity.Conversation;
import com.rishabh.aichatbot.service.ConversationService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import com.rishabh.aichatbot.dto.RenameConversationRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/chat/conversations")
public class ConversationController {

    private final ConversationService conversationService;

    public ConversationController(ConversationService conversationService) {

        this.conversationService = conversationService;

    }

    @PostMapping
    public Conversation createConversation() {

        return conversationService.createConversation();

    }
    
    @GetMapping
    public List<Conversation> getAllConversations() {

        return conversationService.getAllConversations();

    }
    
    @PutMapping("/{id}")
    public Conversation renameConversation(
            @PathVariable String id,
            @Valid @RequestBody RenameConversationRequest request) {

        return conversationService.renameConversation(
                id,
                request.getTitle()
        );

    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteConversation(@PathVariable String id) {

        conversationService.deleteConversation(id);

        return ResponseEntity.ok("Conversation deleted successfully");

    }
}