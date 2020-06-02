package com.example.kiit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1 = findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "kiit.ac.in/academics/faculty/";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b2 = findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = "kiit.ac.in/tour/";
                Uri u = Uri.parse("http://" + s1);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b3 = findViewById(R.id.button8);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2= "www.kiit.ac.in/campuslife/";
                Uri z = Uri.parse("http://" + s2);
                Intent i = new Intent(Intent.ACTION_VIEW, z);
                startActivity(i);
            }
        });
        b4 = findViewById(R.id.button7);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3 = "kiit.ac.in/campuslife/sports/";
                Uri x = Uri.parse("http://" + s3);
                Intent i = new Intent(Intent.ACTION_VIEW, x);
                startActivity(i);
            }
        });
        b5 = findViewById(R.id.button9);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s4 = "kiit.ac.in";
                Uri a = Uri.parse("http://" + s4);
                Intent i = new Intent(Intent.ACTION_VIEW, a);
                startActivity(i);
            }
        });
        b6 = findViewById(R.id.button3);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Department.class);
                startActivity(i);
            }
        });
        b7 = findViewById(R.id.button6);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Courses.class);
                startActivity(i);
            }
        });
        b8 = findViewById(R.id.button10);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s6 = "www.ksrm.ac.in/mba-rm/fee-structure/";
                Uri b = Uri.parse("http://" + s6);
                Intent i = new Intent(Intent.ACTION_VIEW, b);
                startActivity(i);
            }
        });
    }
}
