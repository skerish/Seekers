package com.skerish.seekers;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl, main;

    private static int a1 = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = (RelativeLayout) findViewById(R.id.magic);
        main = (RelativeLayout) findViewById(R.id.main);

        Handler a = new Handler();

        Runnable b1 = new Runnable() {
            @Override
            public void run() {

            rl.setVisibility(View.VISIBLE);

            }
        };

        a.postDelayed(b1, a1);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jj = new Intent(MainActivity.this, menu.class);
                startActivity(jj);
                finish();
            }
        });
    }

}
