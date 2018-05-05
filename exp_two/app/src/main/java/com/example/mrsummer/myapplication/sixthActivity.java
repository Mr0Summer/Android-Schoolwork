package com.example.mrsummer.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sixthActivity extends Activity{
    Button backsix;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sixth);
        backsix=findViewById(R.id.six_back);
        backsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sixthActivity.this,MainActivity.class);
                        startActivity(i);
                        finish();
            }
        });
    }

}
