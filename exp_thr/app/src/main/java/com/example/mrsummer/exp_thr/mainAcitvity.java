package com.example.mrsummer.exp_thr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mainAcitvity extends AppCompatActivity {

    Button out;
    EditText nm_txt;
    Button nm;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        nm_txt = (EditText) findViewById(R.id.nm_txt);
        nm = (Button) findViewById(R.id.nm);

        nm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm_txt.setText("匿名内部类实现");
            }
        });
        //匿名内部类的实现



        Button bn = (Button)findViewById(R.id.bn);
        bn.setOnClickListener(new MyclickListener());

        out = (Button)findViewById(R.id.outside);
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainAcitvity.this,outsidemainActivity.class);
                startActivity(i);
            }
        });
        //跳转到外部类的实现界面
    }





    class MyclickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            EditText txt = (EditText) findViewById(R.id.txt);
            txt.setText("内部类的实现");
        }
    }


}
