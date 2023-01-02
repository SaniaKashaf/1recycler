package com.example.forchecking;

public class ModelClass {

    private String text;
    private int Image;

    public ModelClass(String text, int image) {
        this.text = text;
        Image = image;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return Image;
    }
}
