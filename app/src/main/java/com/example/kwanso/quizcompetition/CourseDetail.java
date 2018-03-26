package com.example.kwanso.quizcompetition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by kwanso on 3/19/18.
 */

public class CourseDetail extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_detail);
    }

    public void onQuizClick(View v){

        Intent i = new Intent(CourseDetail.this, QuizActivity1.class);;
        startActivity(i);
    }
}
