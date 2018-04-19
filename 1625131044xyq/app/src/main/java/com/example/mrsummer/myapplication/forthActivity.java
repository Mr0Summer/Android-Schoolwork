package com.example.mrsummer.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class forthActivity extends Activity {

    private int currentCollor = 0;

    final int[] colors = new int[]{
            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4,
            R.color.color5
    };

    final int[] names = new int[]{
            R.id.view01,
            R.id.view02,
            R.id.view03,
            R.id.view04,
            R.id.view05};

    TextView[] views = new TextView[5];

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message mag) {
            if (mag.what == 0x123) {
                for (int i = 0; i < 5; i++) {
                    views[i].setBackgroundResource(colors[(i + currentCollor) % 5]);
                }
                currentCollor++;
            }
            super.handleMessage(mag);

        }
    };
    Button backfour;
    @Override
    public void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.forth);


        for (int i = 0; i < 5; i++) {
            views[i] = (TextView) findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        }, 0, 200);


        backfour = (Button) findViewById(R.id.four_back);
        backfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(forthActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }

}

