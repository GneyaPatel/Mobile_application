package com.example.mybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Station extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station);
        TextView txt1 = findViewById(R.id.swaminarayanchowk);
        TextView txt2 = findViewById(R.id.railwaystation);
        TextView txt3 = findViewById(R.id.kapodra);
        TextView txt4 = findViewById(R.id.udhana);
        TextView txt5 = findViewById(R.id.kargilchowk);

                txt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) { sc(); }
                });
    }

    public void sc() {
        Intent i = new Intent(this, Sc.class);
        startActivity(i);
    }
}
