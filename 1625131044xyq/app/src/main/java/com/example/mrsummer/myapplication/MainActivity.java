package com.example.mrsummer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_one;
    Button button_two;
    Button button_thr;
    Button button_four;
    Button button_five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_one=findViewById(R.id.button_one);
        button_two=findViewById( R.id.button_two);
        button_thr=findViewById(R.id.button_thr);
        button_four=findViewById(R.id.button_four);
        button_five=findViewById(R.id.button_five);

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                               //第一个按钮，跳转到线性布局界面
                Intent i=new Intent(MainActivity.this,secondActivity.class);
                startActivity(i);
                finish();
            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                               //第二个按钮，跳转到相对布局界面
                Intent i=new Intent(MainActivity.this,thirdActivity.class);
                startActivity(i);
                finish();
            };
        });

        button_thr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,forthActivity.class);
                startActivity(i);
                finish();
            }
        });

        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,fifthActivity.class);
                startActivity(i);
                finish();
                }
        });
 
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,sixthActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
