package com.shg.chatchat.Model;

public class User {
    private String id;
    private String username;
    private String imgUrl;
    private String status;
    private String search;

    public User() {}

    public User(String id, String username, String imgUrl, String status, String search) {
        this.id = id;
        this.username = username;
        this.imgUrl = imgUrl;
        this.status = status;
        this.search = search;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getImgUrl() { return imgUrl; }

    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getSearch() { return search; }

    public void setSearch(String search) { this.search = search; }
}
