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

import org.w3c.dom.Text;

public class PrepareActivity extends AppCompatActivity {

    private Button bnext;
    private VideoView videoView;
    private TableLayout tlPrepareParam;
    private MediaController mediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prepare);

        bnext = (Button)findViewById(R.id.bNext);
        videoView = (VideoView)findViewById(R.id.videoView1);
        tlPrepareParam = (TableLayout)findViewById(R.id.tlPrepareParam);

        mediaController = new MediaController(this, true);
        videoView.setMediaController(mediaController);

        for (int i = 0; i < 2; i++) {
            TextView tvTemp = new TextView(this);
            tvTemp.setText("Repeate", TextView.BufferType.NORMAL);

            TextView tvTemp2 = new TextView(this);
            tvTemp2.setText("100..", TextView.BufferType.NORMAL);

            TableRow trTemp = new TableRow(this);
            trTemp.addView(tvTemp);
            trTemp.addView(tvTemp2);

            tlPrepareParam.addView(trTemp);
        }

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ExerciseActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        String videoUrl = "http://bitly.com/1MC3Gig";
        videoView.setVideoURI(android.net.Uri.parse(videoUrl));
        videoView.start();
    }
}
