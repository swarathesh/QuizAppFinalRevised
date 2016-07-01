package com.salyert.swarathesh.quizappfinal;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
<<<<<<< HEAD
import android.widget.Toast;

public class QuestionFour extends AppCompatActivity {
    private CheckBox check, check2;
    public Store store;
    private Button button;
=======

public class QuestionFour extends AppCompatActivity {

    private CheckBox check, check2;
    public Store store;
    private Button button;

>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
        final Store store = new Store();
<<<<<<< HEAD
        final String name = store.getNAME();
        final int score = store.getSCORE();
=======
>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f
        check = (CheckBox) findViewById(R.id.correct1);
        check2 = (CheckBox) findViewById(R.id.checkBox);
        button = (Button) findViewById(R.id.submit1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check.isChecked() && check2.isChecked()) {
                    int score = store.getSCORE();
                    score++;
                    store.setSCORE(score);
<<<<<<< HEAD
                    Toast.makeText(getApplicationContext(), "hello " + name + " you scored " + String.valueOf(score) + "/4", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "hello " + name + " you scored " + String.valueOf(score) + "/4", Toast.LENGTH_LONG).show();
=======
                    startActivity(new Intent(QuestionFour.this, Results.class));
>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f
                }
            }
        });

    }
<<<<<<< HEAD
    @Override
    public void onBackPressed() {
    }
=======
>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f


}

