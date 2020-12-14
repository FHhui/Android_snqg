package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

public class activity_watchTV extends AppCompatActivity {
//观看视频
    TextView textView_watchTvinfo;
    TextView textView_tvname;
    VideoView videoView_watchTV;
    SeekBar seekBar_watchTV;
    ImageButton imageButton_start;
    ImageButton imageButton_up;
    ImageButton imageButton_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_tv);
        textView_watchTvinfo=findViewById(R.id.textView_watchTvinfo);
        textView_tvname=findViewById(R.id.textView_tvname);
        videoView_watchTV=findViewById(R.id.videoView_watchTV);
        seekBar_watchTV=findViewById(R.id.seekBar_watchTV);
        imageButton_start=findViewById(R.id.imageButton_start);
        imageButton_up=findViewById(R.id.imageButton_up);
        imageButton_next=findViewById(R.id.imageButton_next);
    }
}
