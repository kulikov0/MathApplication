package com.example.root.app_math.Questions;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.vichka.R;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.VerificationError;

public class QuestionOneActivity2 extends android.support.v4.app.Fragment implements Step {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_questionone2, container, false);
        return v;

    }

    @Override
    public void onSelected(){
    }

    @Override
    public VerificationError verifyStep() {
        return null;
    }

    @Override
    public void onError(@NonNull VerificationError error) {
    }


}
