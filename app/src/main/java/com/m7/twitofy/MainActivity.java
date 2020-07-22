package com.m7.twitofy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);

        // Declaring CONTEXT globally will cause the application to crash.
        // This is bcoz context not initialised until onCreate() has finished executing
       final Context CONTEXT = getApplicationContext();

        Button click_here_btn = (Button) findViewById(R.id.click_here_btn);
        click_here_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Toast.makeText(CONTEXT, "Please Wait...", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(CONTEXT, SecondActivity.class);
                startActivity(intent);

            }
        });
    }
}