package com.example.muto.mytvapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Boolean text_flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button text_change_button = (Button) findViewById(R.id.button2);
        Button page_change_button = (Button) findViewById(R.id.button4);

        final TextView textview = (TextView) findViewById(R.id.textView);
        final Intent main2_intent = new Intent(MainActivity.this, Main2Activity.class);

        text_change_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text_flag) {
                    textview.setText("hoge");
                    text_flag = false;
                } else {
                    textview.setText("piyo");
                    text_flag = true;
                }
            }
        });

        page_change_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(main2_intent);
            }
        });
    }
}