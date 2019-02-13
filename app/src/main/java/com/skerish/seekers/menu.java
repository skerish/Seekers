package com.skerish.seekers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class menu extends AppCompatActivity {

    CardView c1, c2 , c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        c1 = (CardView) findViewById(R.id.card1);
        c2 = (CardView) findViewById(R.id.card2);
        c3 = (CardView) findViewById(R.id.card3);
        c4 = (CardView) findViewById(R.id.card4);
        c5 = (CardView) findViewById(R.id.card5);
        c6 = (CardView) findViewById(R.id.card6);
        c7 = (CardView) findViewById(R.id.card7);
        c8 = (CardView) findViewById(R.id.card8);
        c9 = (CardView) findViewById(R.id.card9);
        c10 = (CardView) findViewById(R.id.card10);
        c11 = (CardView) findViewById(R.id.card11);
        c12 = (CardView) findViewById(R.id.card12);
        c13 = (CardView) findViewById(R.id.card13);
        c14 = (CardView) findViewById(R.id.card14);

        c15 = (CardView) findViewById(R.id.card15);
        c16 = (CardView) findViewById(R.id.card16);
        c17 = (CardView) findViewById(R.id.card17);
        c18 = (CardView) findViewById(R.id.card18);
        c19 = (CardView) findViewById(R.id.card19);
        c20 = (CardView) findViewById(R.id.card20);
        c21 = (CardView) findViewById(R.id.card21);
        c22 = (CardView) findViewById(R.id.card22);
        c23 = (CardView) findViewById(R.id.card23);
        c24 = (CardView) findViewById(R.id.card24);
        c25 = (CardView) findViewById(R.id.card25);
        c26 = (CardView) findViewById(R.id.card26);
        c27 = (CardView) findViewById(R.id.card27);
        c28 = (CardView) findViewById(R.id.card28);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j1 = new Intent(menu.this, topic1.class);
                startActivity(j1);
            }
        });


        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j2 = new Intent(menu.this, topic2.class);
                startActivity(j2);
            }
        });


        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j3 = new Intent(menu.this, topic3.class);
                startActivity(j3);
            }
        });


        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j4 = new Intent(menu.this, topic4.class);
                startActivity(j4);
            }
        });


        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j5 = new Intent(menu.this, topic5.class);
                startActivity(j5);
            }
        });


        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j6 = new Intent(menu.this, topic6.class);
                startActivity(j6);
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j7 = new Intent(menu.this, topic7.class);
                startActivity(j7);
            }
        });


        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j8 = new Intent(menu.this, topic8.class);
                startActivity(j8);
            }
        });


        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j9 = new Intent(menu.this, topic9.class);
                startActivity(j9);
            }
        });


        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j10 = new Intent(menu.this, topic10.class);
                startActivity(j10);
            }
        });


        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j11 = new Intent(menu.this, topic11.class);
                startActivity(j11);
            }
        });


        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j12 = new Intent(menu.this, topic12.class);
                startActivity(j12);
            }
        });


        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j13 = new Intent(menu.this, topic13.class);
                startActivity(j13);
            }
        });


        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j14 = new Intent(menu.this, topic14.class);
                startActivity(j14);
            }
        });


        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j15 = new Intent(menu.this, topic15.class);
                startActivity(j15);
            }
        });


        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j16 = new Intent(menu.this, topic16.class);
                startActivity(j16);
            }
        });


        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j17 = new Intent(menu.this, topic17.class);
                startActivity(j17);
            }
        });


        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j18 = new Intent(menu.this, topic18.class);
                startActivity(j18);
            }
        });


        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j19 = new Intent(menu.this, topic19.class);
                startActivity(j19);
            }
        });


        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j20 = new Intent(menu.this, topic20.class);
                startActivity(j20);
            }
        });

        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j21 = new Intent(menu.this, topic21.class);
                startActivity(j21);
            }
        });


        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j22 = new Intent(menu.this, topic22.class);
                startActivity(j22);
            }
        });


        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j23 = new Intent(menu.this, topic23.class);
                startActivity(j23);
            }
        });


        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j24 = new Intent(menu.this, topic24.class);
                startActivity(j24);
            }
        });


        c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j25 = new Intent(menu.this, topic25.class);
                startActivity(j25);
            }
        });


        c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j26 = new Intent(menu.this, topic26.class);
                startActivity(j26);
            }
        });


        c27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j27 = new Intent(menu.this, topic27.class);
                startActivity(j27);
            }
        });


        c28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j28 = new Intent(menu.this, topic28.class);
                startActivity(j28);
            }
        });
    }
}
