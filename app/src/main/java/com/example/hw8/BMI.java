package com.example.hw8;

import android.app.Application;

public class BMI extends Application {
    private String H;
    private String W;
    public void setH(String H){
        this.H=H;
    }
    public void setW(String W){
        this.W=W;
    }
    public String getH(){
        return H;
    }
    public String getW(){
        return W;
    }
}