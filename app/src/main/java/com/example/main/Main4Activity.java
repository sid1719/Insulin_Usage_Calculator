package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private Button button, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent i = getIntent();
        TextView t = findViewById(R.id.textView);
        t.setText(String.valueOf(i.getDoubleExtra("SUM", 0)));

        button = (Button) findViewById(R.id.button10);

        button.setOnClickListener(clicked);

        button3 = (Button) findViewById(R.id.button8);
        button3.setOnClickListener(click);
    }

    View.OnClickListener clicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(i);

        }
    };
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), Main_6Activity.class);
            startActivity(i);
        }

    };
}
