package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private Button button;
    private TextView edit1, edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edit1 = findViewById(R.id.editText);
        edit2 = findViewById(R.id.editText4);

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(clicked);
    }

    View.OnClickListener clicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), Main4Activity.class);
            double s = (((Double.valueOf(edit1.getText().toString()) - 125) / 24) * 0.5) + (Double.valueOf(edit2.getText().toString()) * 0.05);
            i.putExtra("SUM", s);
            startActivity(i);

        }
    };

    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.webmd.com/diet/healthtool-food-calorie-counter"));
        startActivity(browserIntent);
    }
}
