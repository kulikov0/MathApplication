package com.example.root.vichka;


import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

import com.example.root.vichka.Questions.QuestionOneActivity;
import com.squareup.picasso.Picasso;

public class QuestionsActivity extends AppCompatActivity{

    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        initInstancesDrawer();

        CardView question1 = (CardView) findViewById(R.id.question_one);
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intentQuestion1 = new Intent(QuestionsActivity.this, QuestionOneActivity.class);
                QuestionsActivity.this.startActivity(intentQuestion1);
            }

        });

        ImageView image_back2 = (ImageView) findViewById(R.id.main_backdrop);
        Picasso.get()
                .load(R.drawable.materialbackground1)
                .resize(2048, 1024)
                .into(image_back2);


    }



    private void initInstancesDrawer() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.button);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(QuestionsActivity.this, MainActivity.class);
                QuestionsActivity.this.startActivity(intentMain);
            }
        });
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collaptoolbar);
        collapsingToolbarLayout.setTitle("Задачи");
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);



    }
}
