package com.salyert.swarathesh.quizappfinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText name;
    public Store store;
    private Button button;
<<<<<<< HEAD
=======


>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Store store = new Store();
        name = (EditText) findViewById(R.id.PlayerName);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
=======

>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f
                String string = name.getText().toString();
                store.setNAME(string);
                startActivity(new Intent(MainActivity.this, QuestionOne.class));

            }
        });
    }
<<<<<<< HEAD
=======

>>>>>>> f32677b86d96ee1cc07bc76286ba63a16cd2633f
}
