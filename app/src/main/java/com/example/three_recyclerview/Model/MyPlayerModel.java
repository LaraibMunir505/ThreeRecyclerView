package com.example.three_recyclerview.Model;

public class MyPlayerModel {
    private String tv1, tv2;
    private int img;

    public MyPlayerModel(String tv1, String tv2, int img) {
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.img = img;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}



