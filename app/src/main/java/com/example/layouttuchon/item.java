package com.example.layouttuchon;

public class item {
    String title,text1,text2;
    Integer image;

    public item(String title, String text1, String text2, Integer image) {
        this.title = title;
        this.text1 = text1;
        this.text2 = text2;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
