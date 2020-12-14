package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class personinfo_activity extends AppCompatActivity {
    //个人信息页面维护
    TextView textView_helloinfo;
    TextView textView_accountinfo;
    TextView textView_account;
    TextView textView_integralinfo;
    TextView textView_integral;
    TextView textView_recordinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personinfo);
        textView_account=findViewById(R.id.textView_account);
        textView_accountinfo=findViewById(R.id.textView_accountinfo);
        textView_helloinfo=findViewById(R.id.textView_helloinfo);
        textView_integral=findViewById(R.id.textView_integral);
        textView_integralinfo=findViewById(R.id.textView_integralinfo);
        textView_recordinfo=findViewById(R.id.textView_recordinfo);

    }
}
