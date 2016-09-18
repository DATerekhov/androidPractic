package com.example.dmitryterekhov.practic;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class CardioExerciseActivity extends AppCompatActivity {

    private TableLayout tlCardioParam;
    private Button bCardioBegin;
    private Button bCardioPause;
    private Button bCardioStop;
    private Button bCardioSkip;
    private Chronometer chrono;
    private long lastPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardio_exercise);

        bCardioBegin = (Button)findViewById(R.id.bCardioBegin);
        bCardioPause = (Button)findViewById(R.id.bCardioPause);
        bCardioStop = (Button)findViewById(R.id.bCardioStop);
        tlCardioParam = (TableLayout)findViewById(R.id.tlCardioParams);
        chrono = (Chronometer)findViewById(R.id.chronometer);
        bCardioSkip = (Button)findViewById(R.id.bCardioSkip);

        for (int i = 0; i < 4; i++)
        {
            TextView tvTemp = new TextView(this);
            tvTemp.setText("param"+i, TextView.BufferType.NORMAL);
            tvTemp.setTextSize(18.0f);

            TextView tvTemp2 = new TextView(this);
            tvTemp2.setText("1000m", TextView.BufferType.NORMAL);
            tvTemp2.setTextSize(18.0f);

            TableRow trTemp = new TableRow(this);
            trTemp.addView(tvTemp);
            trTemp.addView(tvTemp2);

            tlCardioParam.addView(trTemp);
        }

        bCardioBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.setEnabled(true);
                chrono.start();

                bCardioBegin.setVisibility(View.INVISIBLE);
                bCardioBegin.setFocusable(false);

                bCardioPause.setVisibility(View.VISIBLE);
                bCardioPause.setFocusable(true);

                bCardioStop.setVisibility(View.VISIBLE);
                bCardioStop.setFocusable(true);
            }
        });

        bCardioStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
            }
        });

        bCardioSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ExerciseMarkActivity.class);
                startActivity(intent);
            }
        });

        bCardioPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chrono.isEnabled())
                {
                    lastPause = SystemClock.elapsedRealtime();
                    chrono.stop();
                    chrono.setEnabled(false);
                    bCardioPause.setText("Play");
                }
                else
                {
                    chrono.setBase(chrono.getBase() + SystemClock.elapsedRealtime() - lastPause);
                    chrono.start();
                    chrono.setEnabled(true);
                    bCardioPause.setText("Pause");
                }
            }
        });
    }

}
