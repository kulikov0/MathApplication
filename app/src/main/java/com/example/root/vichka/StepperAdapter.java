package com.example.root.vichka;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

public class StepperAdapter extends AbstractFragmentStepAdapter {

    public StepperAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        final StepFragment step = new StepFragment();
        Bundle b = new Bundle();
//        b.putInt(CURRENT_STEP_POSITION_KEY, position);
        step.setArguments(b);
        return step;
    }

    @Override
    public int getCount() {
        return 12;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        //Override this method to set Step title for the Tabs, not necessary for other stepper types
        return new StepViewModel.Builder(context)
                .setTitle("fucking test") //can be a CharSequence instead
                .create();
    }
}

