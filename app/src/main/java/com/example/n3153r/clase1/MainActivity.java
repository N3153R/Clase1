package com.example.n3153r.clase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton3;
    String mensaje1,mensajeArray;

    TextView textView;
    String[] provincias;
    int[] distancias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton3=(Button) findViewById(R.id.button3);
        mensaje1=getResources().getString(R.string.mensaje1);
        boton3.setText(mensaje1);

        float dimension = getResources().getDimension(R.dimen.tipo_grande);
        boton3.setTextSize(dimension);
        int color = getResources().getColor(R.color.verde);
        boton3.setTextColor(color);

        textView = (TextView) findViewById(R.id.txtArray);
        provincias = getResources().getStringArray(R.array.provincias);
        distancias = getResources().getIntArray(R.array.distancias);
        mensajeArray ="";
        for (int i=0; i<provincias.length; i++)
            mensajeArray +=provincias[i] + " - " + distancias[i] + " \n";

        textView.setText(mensajeArray);
    }
}
