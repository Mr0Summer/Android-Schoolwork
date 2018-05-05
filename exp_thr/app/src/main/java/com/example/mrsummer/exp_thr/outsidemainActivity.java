package com.example.mrsummer.exp_thr;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class outsidemainActivity extends Activity{
    EditText address;
    EditText content;
    Button out_bt;

    @Override
    public void onCreate (Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.outside);

        address = (EditText)findViewById(R.id.address);
        content = (EditText)findViewById(R.id.content);
        Button bn = (Button)findViewById(R.id.send);

        bn.setOnLongClickListener(new outside(this , address , content));

        out_bt = (Button)findViewById(R.id.out_bac);
        out_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(outsidemainActivity.this,mainAcitvity.class);
                startActivity(i);
            }
        });


    }


}
