package com.example.three_recyclerview.Model;

import com.example.three_recyclerview.Adapter.MySportsAdapter;

public class MySportsModel {
    private String tv1;
    private int img3;

    public MySportsModel(String tv1, int img3) {
        this.tv1 = tv1;
        this.img3 = img3;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public int getImg3() {
        return img3;
    }

    public void setImg3(int img3) {
        this.img3 = img3;
    }
}




