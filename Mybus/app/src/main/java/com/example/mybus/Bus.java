package com.example.mybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bus extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.bus);
        TextView txt1 = findViewById(R.id.b107);
        TextView txt2 = findViewById(R.id.b17);
        TextView txt3 = findViewById(R.id.b17E);
        TextView txt4 = findViewById(R.id.b117);

            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) { s(); }
             });

    }
    public void s() {
        Intent i = new Intent(this, S.class);
        startActivity(i);
    }
}
