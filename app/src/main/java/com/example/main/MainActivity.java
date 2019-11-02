package com.example.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById(R.id.button4);
        button.setOnClickListener(clicked);
    }

    View.OnClickListener clicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent (getApplicationContext(),Main2Activity.class);
            startActivity(i);
        }
    };

    /*View.OnClickListener clicked=new View.OnClickListener() {
        @Override
        public void openMain2Activity() {
            Intent i = new Intent (this,Main2Activity.class);
            startActivity(i);
        }
    });*/

}


