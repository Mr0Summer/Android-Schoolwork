package com.example.mrsummer.exp_thr;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mainAcitvity extends AppCompatActivity
        implements View.OnClickListener
{
    //Activity自身作为事件监听器
    Button bn4;
    EditText show;
    //匿名内部类
    Button bn3;
    Button out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //内部类
        Button bn1 = (Button) findViewById(R.id.bn);
        bn1.setOnClickListener(new MyClickListener1());

        out = (Button)findViewById(R.id.outside);
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainAcitvity.this,outsidemainActivity.class);
                startActivity(i);
            }
        });
//跳转到外部类的实现界面


        //匿名内部类
        bn3 = (Button) findViewById(R.id.nm);
        //匿名内部类
        bn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                show.setText("匿名内部类");
            }
        });

        //Activity自身作为事件监听器
        show = (EditText) findViewById(R.id.txt);
        bn4 = (Button) findViewById(R.id.act);
        bn4.setOnClickListener(this);
    }
    //绑定到标签
    public void clickHandler(View source){
        EditText  show1 = (EditText) findViewById(R.id.txt);
        show1.setText("绑定到标签");
    }

    //Activity
    @Override
    public void onClick(View v){
        show.setText("Activity");
    }
    //内部类
    class  MyClickListener1 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            EditText txt = (EditText) findViewById (R.id.txt);
            txt.setText("内部类");
        }
    }
}
