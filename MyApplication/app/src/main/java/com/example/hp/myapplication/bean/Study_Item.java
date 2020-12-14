package com.example.hp.myapplication.bean;

import javax.sql.StatementEvent;

public class Study_Item {
    //学习部分
    String imageView;//图片地址

    public String getImageView() {
        return imageView;
    }

    String studyName;//学习名字



    public String getStudyName() {

        return studyName;
    }

    public Study_Item(String imageView, String studyName) {
        this.imageView = imageView;
        this.studyName = studyName;
    }
}
