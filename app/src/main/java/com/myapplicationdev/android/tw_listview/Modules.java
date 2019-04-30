package com.myapplicationdev.android.tw_listview;

public class Modules {
    private String code;
    private boolean image;

    public Modules (String code, boolean image){
        this.code = code;
        this.image = image;
    }

    public String getCode(){
        return code;
    }

    public boolean isImage(){
        return image;
    }
}
