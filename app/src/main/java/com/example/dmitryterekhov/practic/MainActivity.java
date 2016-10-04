package com.example.dmitryterekhov.practic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Objects.User;

public class MainActivity extends AppCompatActivity {

    private Button bLogin;
    private Button bNextTest;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bLogin = (Button)findViewById(R.id.bLogin);
        bNextTest = (Button)findViewById(R.id.bNextActivityTemp);
        user = new User();

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setLogin("root");
                user.setPassword("root");
                if ((user.getLogin() == "root") && (user.getPassword().equals("root"))) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Pressed", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });

        bNextTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }


}
