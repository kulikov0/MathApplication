package com.example.root.vichka.Lessons;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.vichka.R;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.VerificationError;

public class LessonOneActivity1 extends Fragment implements Step{


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_lessonone1, container, false);
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
