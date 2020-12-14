package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {
    //最起始的欢迎界面
    Button button_login;
    TextView textview_hello;
    Button button_repassward;
    EditText editText_count;
    EditText editText_passward;

    private static final  String realcount="123456";
    private static final  String realpassword="123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_login = findViewById(R.id.button_login);
        textview_hello = findViewById(R.id.textView_hello);
        //button_login=findViewById(R.id.textView_hello);
        button_repassward = findViewById(R.id.button_repassward);
        editText_count = findViewById(R.id.editText_count);

        editText_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_count.setText("");
            }
        });

        editText_passward = findViewById(R.id.editText_passaward);


        button_login.setOnClickListener(new View.OnClickListener() {
            //登录按钮
            @Override
            public void onClick(View v) {

                final String count= editText_count.getText().toString();
                final String password= editText_passward.getText().toString();

                System.out.println(count+"aaa"+realcount);
                System.out.println(password+"aaa"+realpassword);
                if (count.equals(realcount)&&password.equals(realpassword)) {
                    Intent intent_login = new Intent();
                    intent_login.setClass(HelloActivity.this, activity_helloinfo.class);
                    HelloActivity.this.startActivity(intent_login);
                }else{
                    Toast.makeText(HelloActivity.this,"账号或密码错误",Toast.LENGTH_SHORT).show();
                }
            }
        });
        button_repassward.setOnClickListener(new View.OnClickListener() {
            //注册按钮
            @Override
            public void onClick(View v) {
                Intent intent_repassword=new Intent(HelloActivity.this,submit_Activity.class);
                startActivity(intent_repassword);
            }
        });

    }
}
