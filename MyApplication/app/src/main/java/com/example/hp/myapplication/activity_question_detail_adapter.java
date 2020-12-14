package com.example.hp.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hp.myapplication.bean.question;

import java.util.ArrayList;

public class activity_question_detail_adapter extends BaseAdapter {
    private ArrayList<question> questions;
    private Context mContext;

    public activity_question_detail_adapter(ArrayList<question> questions, Context mContext) {
        this.questions = questions;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return questions.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView ==null){

            convertView = LayoutInflater.from(mContext).inflate(R.layout.activity_question_detail,parent,false);

        }

//初始化item的各个组件
        TextView title=(TextView)convertView.findViewById(R.id.title);
        title.setText(questions.get(position).getTitle());
        System.out.println("aaaaaaaaaa"+questions.get(position).getTitle());
        TextView question=convertView.findViewById(R.id.question);
        question.setText(questions.get(position).getQuestion());

        RadioGroup select=convertView.findViewById(R.id.select);

        RadioButton radioButtona = convertView.findViewById(R.id.a);
        radioButtona.setText(questions.get(position).getAnswer_a());

        RadioButton radioButtonb = convertView.findViewById(R.id.b);
        radioButtonb.setText(questions.get(position).getAnswer_b());

        RadioButton radioButtonc = convertView.findViewById(R.id.c);
        radioButtonc.setText(questions.get(position).getAnswer_c());


//设置按钮的监听，实现点击后跳转到酒店详细内容的界面，并且传递数据

        return convertView;

    }
}
