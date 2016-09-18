package com.example.dmitryterekhov.practic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

public class ExerciseMarkActivity extends AppCompatActivity {

    private ListView lvMark;
    private TableLayout tlMarkParams;
    private Button bGoToMenuActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_mark);
        tlMarkParams = (TableLayout)findViewById(R.id.tlMarkParams);
        bGoToMenuActivity = (Button)findViewById(R.id.bGoToMenuActivity);

        bGoToMenuActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });

        for (int i = 0; i < 3; i++)
        {
            TextView tvTemp = new TextView(this);
            tvTemp.setText("Параметр"+i, TextView.BufferType.NORMAL);

            EditText etTemp = new EditText(this);
            etTemp.setInputType(InputType.TYPE_CLASS_NUMBER);

            TableRow trTemp = new TableRow(this);

            trTemp.addView(tvTemp);
            trTemp.addView(etTemp);

            tlMarkParams.addView(trTemp);
        }
    }
}
