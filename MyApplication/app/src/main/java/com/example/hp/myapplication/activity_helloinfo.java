package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_helloinfo extends AppCompatActivity {
    //用户登陆之后看到的主页面
    Button button_userinfo;
    Button button_startstudy;
    Button button_remedtion;
    Button button_starttest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloinfo);
        button_remedtion=findViewById(R.id.button_remedtion);
        button_remedtion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_remedtion=new Intent();
                intent_remedtion.setClass(activity_helloinfo.this,activity_redemtion.class);
                activity_helloinfo.this.startActivity(intent_remedtion);
            }
        });
        button_startstudy=findViewById(R.id.button_startstudy);
        button_startstudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_startstudy=new Intent();
                intent_startstudy.setClass(activity_helloinfo.this,activity_study_online.class);
                activity_helloinfo.this.startActivity(intent_startstudy);
            }
        });
        button_userinfo=findViewById(R.id.button_userinfo);
        button_userinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_userinfo=new Intent();
                intent_userinfo.setClass(activity_helloinfo.this,personinfo_activity.class);
                activity_helloinfo.this.startActivity(intent_userinfo);
            }
        });
        button_starttest=findViewById(R.id.button_starttest);
        button_starttest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_starttest=new Intent();
                intent_starttest.setClass(activity_helloinfo.this,activity_test.class);
                activity_helloinfo.this.startActivity(intent_starttest);
            }
        });
    }
}
