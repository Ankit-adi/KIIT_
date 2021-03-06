package com.example.kiit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Courses extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "cse.kiit.ac.in";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "kims.kiit.ac.in";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "law.kiit.ac.in";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b4 = findViewById(R.id.b3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "ksom.ac.in";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "ksrm.ac.in";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Courses.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
