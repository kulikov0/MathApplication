package com.example.root.app_math.Lessons;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.root.vichka.R;
import com.stepstone.stepper.StepperLayout;

public class LessonOneActivity extends AppCompatActivity{

    private StepperLayout mStepperLayout;

//    private final static String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessonone);
        mStepperLayout = (StepperLayout) findViewById(R.id.stepperLayout);
        mStepperLayout.setAdapter(new StepperAdapter(getSupportFragmentManager(), this));
        //enable action bar
        getSupportActionBar().setTitle("Введение в комбинаторику");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}


