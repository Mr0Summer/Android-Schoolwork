package com.example.mrsummer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class thirdActivity extends AppCompatActivity{
    Button backthr;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        backthr=findViewById(R.id.thr_back);
        backthr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(thirdActivity.this,MainActivity.class);
            startActivity(i);
            finish();
            }
        });
    }

}
