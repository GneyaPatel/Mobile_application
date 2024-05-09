package com.example.mybus;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sc extends AppCompatActivity {
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sc);
        TextView txt1 = findViewById(R.id.b1);
        TextView txt2 = findViewById(R.id.b2);
        TextView txt3 = findViewById(R.id.b3);
        TextView txt4 = findViewById(R.id.b4);
    }
}
