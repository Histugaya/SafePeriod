package com.example.roshan.design_safeperiods;

public class Blog_User_PostItems {

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

    public String getCommentby() {
        return commentby;
    }

    public void setCommentby(String commentby) {
        this.commentby = commentby;
    }

    private String commentby;

    public Blog_User_PostItems(String username, String date, String title, String description, String commentby) {
        this.username = username;
        this.date = date;
        this.title = title;
        this.description = description;
        this.commentby = commentby;
    }
}
