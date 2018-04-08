package com.example.mrsummer.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifthActivity extends Activity {
        Button backfif;
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fifth);

            backfif=(Button)findViewById(R.id.fif_back);
            backfif.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(fifthActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });


        }
}
