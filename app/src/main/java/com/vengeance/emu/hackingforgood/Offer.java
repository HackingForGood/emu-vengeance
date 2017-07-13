package com.vengeance.emu.hackingforgood;

/**
 * Created by will on 7/13/17.
 */


public class Offer {

    private String username;
    private String title;

    public Offer() {}

    public Offer(String username, String title) {
        this.username = username;
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
