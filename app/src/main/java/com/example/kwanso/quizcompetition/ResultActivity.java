package com.example.kwanso.quizcompetition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by kwanso on 3/19/18.
 */

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
    }

    public void onQuizClick(View v){

        Intent i = new Intent(ResultActivity.this, QuizActivity1.class);;
        startActivity(i);
        finish();
    }
}
