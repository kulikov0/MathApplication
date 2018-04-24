package com.example.root.app_math;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.root.vichka.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnQuestions = (Button) findViewById(R.id.questionsButton);
        Button btnTheory = (Button) findViewById(R.id.theoryButton);

        btnQuestions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentTheory = new Intent(MainActivity.this, QuestionsActivity.class);
                MainActivity.this.startActivity(intentTheory);
            }
        });

        btnTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuestions = new Intent(MainActivity.this, TheoryActivity.class);
                MainActivity.this.startActivity(intentQuestions);
            }
        });

    }
}
