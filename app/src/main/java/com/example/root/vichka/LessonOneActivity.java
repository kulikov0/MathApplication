package com.example.root.vichka;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;

public class LessonOneActivity extends AppCompatActivity{

    private StepperLayout mStepperLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessonone);
        mStepperLayout = (StepperLayout) findViewById(R.id.stepperLayout);
        mStepperLayout.setAdapter(new StepperAdapter(getSupportFragmentManager(), this));
    }
}


