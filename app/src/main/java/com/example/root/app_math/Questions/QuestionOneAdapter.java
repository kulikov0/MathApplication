package com.example.root.app_math.Questions;


import android.content.Context;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

public class QuestionOneAdapter extends AbstractFragmentStepAdapter {

    public QuestionOneAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        return new StepViewModel.Builder(context)
                .create();
    }
}
