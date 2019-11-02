package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_6Activity extends AppCompatActivity {
    private Button button, button3;
    private TextView edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_6);

        edit1 = findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(clicked);
        button3 = (Button) findViewById(R.id.button9);
        button3.setOnClickListener(click);


    }

    View.OnClickListener clicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            double s = ((Double.valueOf(edit1.getText().toString()) - 1750) / 11.6);
            double r = ((Double.valueOf(edit1.getText().toString()) - 1750) / 5.56);
            double u = ((Double.valueOf(edit1.getText().toString()) - 1750) / 7.76);
            i.putExtra("SUM", s);
            i.putExtra("SUM1", r);
            i.putExtra("SUM2", u);
            //startActivity(i);
            //Intent j = getIntent();
            TextView t = findViewById(R.id.textView10);
            TextView a = findViewById(R.id.textView12);
            TextView b = findViewById(R.id.textView13);
            t.setText(String.valueOf(i.getDoubleExtra("SUM", 0)));
            a.setText(String.valueOf(i.getDoubleExtra("SUM1", 0)));
            b.setText(String.valueOf(i.getDoubleExtra("SUM2", 0)));
        }
    };
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(i);
        }

    }; public void browser2(View view) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.medindia.net/patients/calculators/daily-calorie-counter-indian-food.asp"));
            startActivity(browserIntent);
        }
    };
