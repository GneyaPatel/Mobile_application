package com.example.mybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        MaterialButton srh_sta = (MaterialButton) findViewById(R.id.srh_sta);
        MaterialButton srh_bus = (MaterialButton) findViewById(R.id.srh_bus);

        srh_sta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              station();
            }
        });

        srh_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bus();
            }
        });
    }

    public void station() {
        Intent i = new Intent(this, Station.class);
        startActivity(i);
    }

    public void bus() {
        Intent i = new Intent(this, Bus.class);
        startActivity(i);
    }
}
