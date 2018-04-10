package com.example.root.vichka;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnQuestions = (Button) findViewById(R.id.questionsButton);
        Button btnTheory = (Button) findViewById(R.id.theoryButton);

        btnQuestions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentTheory = new Intent(MainActivity.this, QuestionsActivity.class);
                MainActivity.this.startActivity(intentTheory);
            }
        });

        btnTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuestions = new Intent(MainActivity.this, TheoryActivity.class);
                MainActivity.this.startActivity(intentQuestions);
            }
        });
/*
        mVideoView = (VideoView) findViewById(R.id.bgVideoView);

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

*/
    }
//restart video
//запускаем видео заново при переключении из предыдущих активити
/*    @Override
    public void onResume() {
        super.onResume();

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        mVideoView.setVideoURI(uri);
        mVideoView.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        mVideoView.stopPlayback();
   }   */
}
