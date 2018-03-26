package com.example.kwanso.quizcompetition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by kwanso on 3/19/18.
 */

public class QuizActivity3 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity_3);
    }

    public void onBackClick(View v){
        finish();
    }

    public void onNextClick(View v){
        Intent i = new Intent(QuizActivity3.this, ResultActivity.class);;
        startActivity(i);
    }
}
