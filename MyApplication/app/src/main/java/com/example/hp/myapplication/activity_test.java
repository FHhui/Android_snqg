package com.example.hp.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hp.myapplication.bean.question;

import java.util.ArrayList;

public class activity_test extends AppCompatActivity {
    //在线测试页面
    TextView textView_hello;
    TextView textView_timeinfo;
    TextView time;
    ListView listViewquestion;
    Button commit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textView_hello=findViewById(R.id.textView_hello);
        textView_timeinfo=findViewById(R.id.textView_timeinfo);
        time=findViewById(R.id.time);
        listViewquestion=findViewById(R.id.question);
        commit=findViewById(R.id.commit);

        Resources resources = this.getResources();
        ArrayList<question> questions=new ArrayList<>();

        question question1=
                new question("1","你是不是傻","啊","啊啊","啊啊啊","啊啊啊","啊啊啊啊");
        question question2=
                new question("2","你是不是傻？","啊","啊啊","啊啊","啊啊啊","啊啊啊啊");
        question question3=
                new question("3","你是不是真傻","啊","啊啊","啊啊","啊啊啊","啊啊啊啊");
        question question4=
                new question("4","你是不是真傻？","啊","啊啊","啊啊","啊啊啊","啊啊啊啊");
        question question5=
                new question("5","你是真的傻？","啊","啊啊","啊啊","啊啊啊","啊啊啊啊");
        question question6=
                new question("6","你就是一小人才","啊","啊啊","啊啊","啊啊啊","啊啊啊啊");
        question question7=
                new question("7","你是？","啊","啊啊","啊啊","啊啊啊","啊啊啊啊");
        question question8=
                new question("8","你就是？","啊","啊啊","啊啊","啊啊啊","啊啊啊啊");

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);

        activity_question_detail_adapter adapter=
                new activity_question_detail_adapter(questions,activity_test.this);

        listViewquestion.setAdapter(adapter);

    }
}
