package com.example.mrsummer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class horizontal extends AppCompatActivity{

    Button horsec;
    Button horthr;
    Button horbac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.horizontal);

        horbac=(Button)findViewById(R.id.hor_back);
        horsec=(Button)findViewById(R.id.hor_two) ;
        horthr=(Button)findViewById(R.id.hor_thr);

        horbac.setOnClickListener(new View.OnClickListener() {                     //button to MainActivity  主界面
            @Override
            public void onClick(View view) {
                Intent i=new Intent(horizontal.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        horsec.setOnClickListener(new View.OnClickListener(){                       //button to horizontal      水平布局
            @Override
            public void onClick(View view){
                Intent i = new Intent(horizontal.this,secondActivity.class);
                startActivity(i);
                finish();
            }
        });

        horthr.setOnClickListener(new View.OnClickListener(){                       //button to left                靠左对齐
            @Override
            public void onClick(View view){
                Intent i = new Intent(horizontal.this,left.class);
                startActivity(i);
                finish();
            }
        });



    }}
