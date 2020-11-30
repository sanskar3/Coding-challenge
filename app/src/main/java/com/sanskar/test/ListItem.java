package com.sanskar.test;

public class ListItem {

    private String head;
    private String desc;
    private String imageUrl;
    private int rating;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getRating() {
        return rating;
    }

    public ListItem(String head, String desc, String imageUrl, int rating) {
        this.head = head;
        this.desc = desc;
        this.imageUrl = imageUrl;
        this.rating= rating;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
