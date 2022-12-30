package com.example.three_recyclerview.Model;

public class MyTeamModel {
    private String txt1;
    private String color;
    private int image;

    public MyTeamModel(String txt1, String color, int image) {
        this.txt1 = txt1;
        this.color = color;
        this.image = image;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
