package com.m7.twitofy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class SecondActivity extends AppCompatActivity {

    String text_to_search;
    EditText word_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        word_input = (EditText) findViewById(R.id.word_input);

        Button go_btn = (Button) findViewById(R.id.go_btn);
        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_to_search = word_input.getText().toString();

                // Hides keyboard
                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
            }
        });


        TabLayout tab_analytics = findViewById(R.id.tab_analytics);
        TabItem graph_tab = findViewById(R.id.graph);
        TabItem tweets_tab = findViewById(R.id.tweets);
        ViewPager2 viewPager = findViewById(R.id.viewPager);


    }
}