package com.example.root.app_math;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

import com.example.root.app_math.Lessons.LessonOneActivity;
import com.example.root.vichka.R;
import com.squareup.picasso.Picasso;


public class TheoryActivity extends AppCompatActivity{

    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        initInstancesDrawer();

        CardView lesson1 = (CardView) findViewById(R.id.lesson_one);
        lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLesson1 = new Intent(TheoryActivity.this, LessonOneActivity.class);
                TheoryActivity.this.startActivity(intentLesson1);
            }
        });

        ImageView back_image1 = (ImageView) findViewById(R.id.main_backdrop1);
        Picasso.get()
                .load(R.drawable.materialbackground2)
                .resize(2048, 1024)
                .into(back_image1);
    }

    private void initInstancesDrawer(){


        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.button);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(TheoryActivity.this, MainActivity.class);
                TheoryActivity.this.startActivity(intentMain);
            }
        });
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collaptoolbar1);
        collapsingToolbarLayout.setTitle("Теория");
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);



    }


}
