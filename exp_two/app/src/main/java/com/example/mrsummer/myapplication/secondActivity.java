package com.example.mrsummer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class secondActivity  extends AppCompatActivity{
    Button backsec;
    Button secone;
    Button secthr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);

        backsec=(Button)findViewById(R.id.sec_back);
        secone=(Button)findViewById(R.id.sec_one) ;
        secthr=(Button)findViewById(R.id.sec_thr);

        backsec.setOnClickListener(new View.OnClickListener() {                     //button to MainActivity  主界面
            @Override
            public void onClick(View view) {
                Intent i=new Intent(secondActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        secone.setOnClickListener(new View.OnClickListener(){                       //button to horizontal      水平布局
            @Override
            public void onClick(View view){
                Intent i = new Intent(secondActivity.this,horizontal.class);
                startActivity(i);
                finish();
            }
        });

        secthr.setOnClickListener(new View.OnClickListener(){                       //button to left                靠左对齐
            @Override
            public void onClick(View view){
                Intent i = new Intent(secondActivity.this,left.class);
                startActivity(i);
                finish();
            }
        });




}}
