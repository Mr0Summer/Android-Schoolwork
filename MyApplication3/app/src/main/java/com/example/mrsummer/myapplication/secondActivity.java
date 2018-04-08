package com.example.mrsummer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class secondActivity  extends AppCompatActivity{
    Button backsec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        backsec=(Button)findViewById(R.id.sec_back);
        backsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(secondActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
}}
