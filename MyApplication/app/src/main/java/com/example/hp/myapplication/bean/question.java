package com.example.hp.myapplication.bean;

public class question {
    String title;
    String question;
    String answer_a;
    String answer_b;
    String answer_c;
    String answer_d;
    String answer_true;

    public question(String title,String question, String answer_a, String answer_b, String answer_c, String answer_d, String answer_true) {
        this.title=title;
        this.question = question;
        this.answer_a = answer_a;
        this.answer_b = answer_b;
        this.answer_c = answer_c;
        this.answer_d = answer_d;
        this.answer_true = answer_true;
    }

    public String getTitle() {
        return title;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer_a() {
        return answer_a;
    }

    public String getAnswer_b() {
        return answer_b;
    }

    public String getAnswer_c() {
        return answer_c;
    }

    public String getAnswer_d() {
        return answer_d;
    }

    public String getAnswer_true() {
        return answer_true;
    }
}
