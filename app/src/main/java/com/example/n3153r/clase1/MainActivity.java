package com.example.n3153r.clase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton3,btnNuevo;
    String mensaje,mensajeArray;

    TextView textView;
    String[] provincias;
    int[] distancias;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton3=(Button) findViewById(R.id.button3);
        mensaje=getResources().getString(R.string.mensaje3);
        boton3.setText(mensaje);

        float dimension = getResources().getDimension(R.dimen.tipo_grande);
        boton3.setTextSize(dimension);
        int color = getResources().getColor(R.color.amarillo);
        boton3.setTextColor(color);

        textView = (TextView) findViewById(R.id.txtArray);
        provincias = getResources().getStringArray(R.array.provincias);
        distancias = getResources().getIntArray(R.array.distancias);
        mensajeArray ="";
        for (int i=0; i<provincias.length; i++)
            mensajeArray +=provincias[i] + " - " + distancias[i] + " \n";

        textView.setText(mensajeArray);

//        nueva ventana

        btnNuevo =(Button) findViewById(R.id.btnNueva);
        btnNuevo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case  R.id.btnNueva:
                Intent intent = new Intent(this,Main2Activity.class);
//
                startActivity(intent);

                break;
            default:
                break;
        }
    }
}
