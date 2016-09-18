package com.example.dmitryterekhov.practic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.VideoView;

public class ExerciseActivity extends AppCompatActivity {

    private TableLayout tlParameters;
    private VideoView vvExerciseVideo;
    private MediaController mediaController;
    private Button bSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);

        tlParameters = (TableLayout)findViewById(R.id.tlParameters);

        vvExerciseVideo = (VideoView)findViewById(R.id.vvExerciseVideo);
        mediaController = new MediaController(this, true);
        vvExerciseVideo.setMediaController(mediaController);

        for (int i = 0; i < 4; i++) {
            TextView tvTemp = new TextView(this);
            tvTemp.setText("Repeate"+i, TextView.BufferType.NORMAL);

            TextView tvTemp2 = new TextView(this);
            tvTemp2.setText("100..", TextView.BufferType.NORMAL);

            TableRow trTemp = new TableRow(this);
            trTemp.addView(tvTemp);
            trTemp.addView(tvTemp2);

            tlParameters.addView(trTemp);
        }

        bSkip = (Button)findViewById(R.id.bSkip);
        bSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ExerciseMarkActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        String videoUri = "http://bitly.com/1MC3Gig";
        vvExerciseVideo.setVideoURI(android.net.Uri.parse(videoUri));
        vvExerciseVideo.start();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }
}
