package com.example.gchatz.formobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bambakera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bambakera);
        Button b1=(Button)findViewById(R.id.but1);
        Button b2=(Button)findViewById(R.id.but2);
        Button b3=(Button)findViewById(R.id.but3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bambakera.this, Agapimena.class));
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bambakera.this, Plisi.class));
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bambakera.this, Vathmoi.class));
            }

        });

        Button b4=(Button)findViewById(R.id.but5);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bambakera.this, Strofes.class));
            }

        });


    }
}
