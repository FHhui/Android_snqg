package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class activity_redemtion extends AppCompatActivity {
//积分兑换页面
    TextView textView_interalinfo;
    ListView ListView_shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redemtion);
        textView_interalinfo=findViewById(R.id.textView_interalinfo);
        ListView_shop=findViewById(R.id.ListView_shop);
    }
}
