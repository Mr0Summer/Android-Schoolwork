package com.example.mrsummer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class left extends AppCompatActivity {
    Button lefone;
    Button leftwo;
    Button lefbac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.left);

        lefone=(Button)findViewById(R.id.lef_one);
        leftwo=(Button)findViewById(R.id.lef_two);
        lefbac=(Button)findViewById(R.id.lef_back);

        lefbac.setOnClickListener(new View.OnClickListener() {                     //button to MainActivity  主界面
            @Override
            public void onClick(View view) {
                Intent i=new Intent(left.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        lefone.setOnClickListener(new View.OnClickListener() {                      //button to horizontal      水平对齐
            @Override
            public void onClick(View v) {
                Intent i = new Intent(left.this,horizontal.class);
                startActivity(i);
                finish();
            }
        });

        leftwo.setOnClickListener(new View.OnClickListener() {                      //button to second            垂直对齐
            @Override
            public void onClick(View v) {
                Intent i = new Intent(left.this,secondActivity.class);
                startActivity(i);
                finish();
            }
        });





    }



}
