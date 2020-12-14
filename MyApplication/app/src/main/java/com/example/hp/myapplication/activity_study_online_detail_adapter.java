package com.example.hp.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.myapplication.bean.Study_Item;

import java.util.ArrayList;

public class activity_study_online_detail_adapter extends BaseAdapter{
    private ArrayList<Study_Item>  mData;

    private Context mContext;

    public  activity_study_online_detail_adapter(ArrayList mData,Context mContext){

        this.mData=mData;

        this.mContext=mContext;

    }

    @Override
    public int getCount() {

        return mData.size();

    }

    @Override

    public Object getItem(int position) {

        return null;

    }

    @Override

    public long getItemId(int position) {

        return position;

    }

    @Override

    public View getView(final int position, View convertView, ViewGroup parent) {

        if(convertView ==null){

            convertView = LayoutInflater.from(mContext).inflate(R.layout.activity_study_online_detail,parent,false);

        }

//初始化item的各个组件
        final TextView textView_studyname=(TextView)convertView.findViewById(R.id.textView_studyname);

        textView_studyname.setText(mData.get(position).getStudyName());
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);

        Button button_start=(Button)convertView.findViewById(R.id.button_start);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_watch_tv=new Intent();
                intent_watch_tv.setClass(mContext,activity_watchTV.class);
                Bundle bundle = new Bundle();
                bundle.putString("studyName",textView_studyname.getText().toString());
                intent_watch_tv.putExtras(bundle);
                mContext.startActivity(intent_watch_tv);
            }
        });
//设置按钮的监听，实现点击后跳转到酒店详细内容的界面，并且传递数据
        return convertView;

    }

}
