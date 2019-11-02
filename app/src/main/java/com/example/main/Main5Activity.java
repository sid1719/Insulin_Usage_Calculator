package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button = (Button) findViewById(R.id.buttonlast);
        button.setOnClickListener(clicked);
    }

    View.OnClickListener clicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent (getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    };

}
