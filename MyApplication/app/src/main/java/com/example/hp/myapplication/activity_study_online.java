package com.example.hp.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hp.myapplication.bean.Study_Item;

import java.util.ArrayList;

public class activity_study_online extends AppCompatActivity {
//在线学习页面
    TextView textView_study_onlineinfo;
    ListView ListView_dynamic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_online);
        textView_study_onlineinfo=findViewById(R.id.textView_study_onlineinfo);
        ListView_dynamic=findViewById(R.id.ListView_dynamic);
        Resources resources = this.getResources();
        ArrayList<Study_Item> dynamic=new ArrayList();
        ArrayList tags=new ArrayList();

        Study_Item study1=new Study_Item("","今天你学习了么");
        Study_Item study2=new Study_Item("","今天你学习了吗？");
        Study_Item study3=new Study_Item("","今天你学习了没");
        Study_Item study4=new Study_Item("","今天你学习了？");
        Study_Item study5=new Study_Item("","今天你学习？");

        dynamic.add(study1);
        dynamic.add(study2);
        dynamic.add(study3);
        dynamic.add(study4);
        dynamic.add(study5);

        activity_study_online_detail_adapter adapter=
                new activity_study_online_detail_adapter(dynamic,activity_study_online.this);

        ListView_dynamic.setAdapter(adapter);


    }
}
