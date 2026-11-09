package com.rishabh.aichatbot.dto;

import jakarta.validation.constraints.NotBlank;

public class RenameConversationRequest {

    @NotBlank(message = "Title cannot be empty")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}