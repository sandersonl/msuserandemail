package com.ms.user.dtos;

import java.util.UUID;

public class EmailDto {

    private UUID userId;
    private String EmailTo;
    private String subject;
    private String text;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmailTo() {
        return EmailTo;
    }

    public void setEmailTo(String emailTo) {
        EmailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
