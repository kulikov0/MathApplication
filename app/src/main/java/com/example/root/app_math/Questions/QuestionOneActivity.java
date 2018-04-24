package com.example.root.app_math.Questions;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.example.root.vichka.R;
import com.stepstone.stepper.StepperLayout;

public class QuestionOneActivity extends AppCompatActivity {

    private StepperLayout mStepperLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionone);
        mStepperLayout = (StepperLayout) findViewById(R.id.stepperLayoutForQOne);
        mStepperLayout.setAdapter(new QuestionOneAdapter(getSupportFragmentManager(), this));
        getSupportActionBar().setTitle("Введение задачи");
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







