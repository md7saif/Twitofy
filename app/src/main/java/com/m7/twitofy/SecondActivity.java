package com.m7.twitofy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;


public class SecondActivity extends AppCompatActivity {

    String text_to_search;
    EditText keyword_input;
    EditText date_since_input;
    EditText date_until_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        final Context CONTEXT = getApplicationContext();

        keyword_input = (EditText) findViewById(R.id.input_keyword);
        date_since_input = (EditText) findViewById(R.id.input_date_since);
        date_until_input = (EditText) findViewById(R.id.input_date_until);

        Button go_btn = (Button) findViewById(R.id.go_btn);
        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_to_search = keyword_input.getText().toString();

                Intent intent = new Intent(CONTEXT, ThirdActivity.class);
                startActivity(intent);

                // Hides keyboard
                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
            }
        });


    }
}