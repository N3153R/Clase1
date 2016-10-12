package com.example.n3153r.clase1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

public class Main4Activity extends Activity {

    ImageView primera;
    ImageView segunda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        primera =(ImageView) findViewById(R.id.circulo);
        segunda =(ImageView) findViewById(R.id.cuadrado);

    }

    public void circulo(View view){
        segunda.setVisibility(View.VISIBLE);
        primera.setVisibility(View.GONE);
    }
    public void cuadrado(View view){
        primera.setVisibility(View.VISIBLE);
        segunda.setVisibility(View.GONE);
    }
}
