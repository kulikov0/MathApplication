package com.example.root.app_math.Lessons;


import android.content.Context;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

import com.example.root.vichka.R;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

public class StepperAdapter extends AbstractFragmentStepAdapter {

    public StepperAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        Step step = new StepFragment();
        switch(position) {
            case 0:
                step = new StepFragment();
                break;
            case 1:
                step = new LessonOneActivity1();
                break;
        }
        return step;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        StepViewModel.Builder builder = new StepViewModel.Builder(context);
        switch (position) {
            case 0:
                builder
                        .setEndButtonLabel("This way")
                        .setBackButtonLabel("Cancel")
                        .setNextButtonEndDrawableResId(R.drawable.forward_arrow)
                        .setBackButtonStartDrawableResId(StepViewModel.NULL_DRAWABLE);
                break;
            case 1:
                builder
                        .setEndButtonLabel("Go to summary")
                        .setBackButtonLabel("Go to first")
                        .setBackButtonStartDrawableResId(R.drawable.back_arrow);
                break;
            case 2:
                builder
                        .setBackButtonLabel("Go back")
                        .setEndButtonLabel("I'm done!");
                break;
            default:
                throw new IllegalArgumentException("Unsupported position: " + position);
        }
        return builder.create();
    }
}

