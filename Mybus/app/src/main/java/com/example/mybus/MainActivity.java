package com.example.mybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("1234")) {
                    //correct password
                    Toast.makeText( MainActivity.this,  "LOGIN SUCCESSFULL !!!",Toast.LENGTH_SHORT).show();
                    search();
                }else
                    //incorrect
                    Toast.makeText( MainActivity.this,  "LOGIN FAIL !!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void search() {
        Intent i = new Intent(this, Search.class);
        startActivity(i);
    }
}