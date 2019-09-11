package com.company.jhoanrivers.belajarbahasainggris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mquestionlibrary = new QuestionLibrary();
    private TextView mscoreview;
    private TextView mquestionview;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;
    private String mAnswer;
    private int score = 0;
    private int mquestionNumber=0;
    private TextView questionupdate;
    private int questionnumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mscoreview = (TextView) findViewById(R.id.score);
        mquestionview = (TextView) findViewById(R.id.TxtQuestion);
        choice1 = (Button) findViewById(R.id.choose1);
        choice2 = (Button) findViewById(R.id.choose2);
        choice3 = (Button) findViewById(R.id.choose3);
        choice4 = (Button) findViewById(R.id.choose4);
        questionupdate = (TextView) findViewById(R.id.questionupdatenumber);

        updateQuestion();

        choice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(choice1.getText() == mAnswer){
                    score = score+10;
                    updateScore(score);
                    updateQuestion();

                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        choice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(choice2.getText() == mAnswer){

                    score = score+10;
                    updateScore(score);
                    updateQuestion();

                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        choice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(choice3.getText() == mAnswer){

                    score = score+10;
                    updateScore(score);
                    updateQuestion();

                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        choice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(choice4.getText() == mAnswer){

                    score = score+10;
                    updateScore(score);
                    updateQuestion();

                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }
    public void updateQuestion(){
        if(mquestionNumber<mquestionlibrary.getLength()) {
            mquestionview.setText(mquestionlibrary.getQuestion(mquestionNumber));
            choice1.setText(mquestionlibrary.getChoice1(mquestionNumber));
            choice2.setText(mquestionlibrary.getChoice2(mquestionNumber));
            choice3.setText(mquestionlibrary.getChoice3(mquestionNumber));
            choice4.setText(mquestionlibrary.getChoice4(mquestionNumber));
            mAnswer = mquestionlibrary.getCorrectAnswer(mquestionNumber);
            mquestionNumber++;
            questionnumber++;
            updatequestion(questionnumber);

        }
       else{
            Intent intent = new Intent(MainActivity.this,ResultActivity.class);
            intent.putExtra("score",score);// getting score to new screen
            startActivity(intent);
        }

    }

    private void updateScore (int point){
        mscoreview.setText(""+ score);
    }
    private void updatequestion(int point){
        questionupdate.setText(""+questionnumber);
    }
}
