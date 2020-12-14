package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class submit_Activity extends AppCompatActivity {
    //注册账号页面
    TextView textView_thanks;
    TextView textView_infoforuser;
    EditText editText_inputinfo;
    TextView textView_tipforinput;
    EditText editText_password;
    TextView textView_reinput;
    EditText editText_password_2;
    Button button_besure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_activity);
        textView_thanks=findViewById(R.id.textView_thanks);
        textView_infoforuser=findViewById(R.id.textView_infoforuser);
        editText_inputinfo=findViewById(R.id.editText_inputinfo);

        textView_tipforinput=findViewById(R.id.textView_tipforinput);

        editText_password=findViewById(R.id.editText_password);

        editText_password_2=findViewById(R.id.editText_password_2);

        button_besure=findViewById(R.id.button_besure);
        button_besure.setOnClickListener(new View.OnClickListener() {
            //确认注册按钮
            @Override
            public void onClick(View v) {
                String inputinfo=editText_inputinfo.getText().toString();
                String password=editText_password.getText().toString();
                String password_2=editText_password_2.getText().toString();
                if (password.equals(password_2)){
                    Toast.makeText(submit_Activity.this,"注册成功",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(submit_Activity.this,"密码不一致",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
