package com.linh.app.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equalsIgnoreCase("admin") &&
                        password.getText().toString().equalsIgnoreCase("admin")) {
                    Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_SHORT).show();
                    final Intent intent = new Intent (getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong information", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

