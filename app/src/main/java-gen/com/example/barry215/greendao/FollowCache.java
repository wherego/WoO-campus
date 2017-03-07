package com.example.barry215.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FOLLOW_CACHE".
 */
public class FollowCache {

    private Long id;
    private String userId;
    private String followId;

    public FollowCache() {
    }

    public FollowCache(Long id) {
        this.id = id;
    }

    public FollowCache(Long id, String userId, String followId) {
        this.id = id;
        this.userId = userId;
        this.followId = followId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFollowId() {
        return followId;
    }

    public void setFollowId(String followId) {
        this.followId = followId;
    }

}