package com.example.mrsummer.myapplication;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;


public class forthActivity extends AppCompatActivity {
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(final Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.forth);
        Button back;

        viewFlipper = (ViewFlipper) findViewById(R.id.play);

        back=(Button)findViewById(R.id.four_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(forthActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void auto(View source){
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setInAnimation(this,android.R.anim.slide_out_right);
        viewFlipper.startFlipping();
    }
}

