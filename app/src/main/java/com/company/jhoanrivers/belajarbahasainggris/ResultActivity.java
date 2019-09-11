package com.company.jhoanrivers.belajarbahasainggris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    public TextView mfinalscore;
    public Button prevbutton;
    public Button nextbutton;


    public void getscore(){
        mfinalscore = (TextView) findViewById(R.id.finalscore);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score",0);
        if (score == 100){
            Toast.makeText(ResultActivity.this,"Selamat, anda menjawab semua soal dengan benar",Toast.LENGTH_SHORT).show();
        }
        mfinalscore.setText(""+score);
    }


    public void buttonprevious(){
        prevbutton = (Button) findViewById(R.id.prevbutton);
        prevbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(myintent);
            }
        });
    }

    public void buttonnext(){
        nextbutton = (Button) findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(ResultActivity.this,AnswerActivity.class);
                startActivity(myintent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getscore();
        buttonnext();
        buttonprevious();

    }
}
