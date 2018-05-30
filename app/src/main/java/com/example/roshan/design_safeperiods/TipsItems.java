package com.example.roshan.design_safeperiods;

public class TipsItems {
    private String username;
    private String date;
    private String title;
    private String description;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TipsItems(String username, String date, String title, String description) {
        this.username = username;
        this.date = date;
        this.title = title;
        this.description = description;
    }
}
