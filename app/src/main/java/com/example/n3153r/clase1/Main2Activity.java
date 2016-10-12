package com.example.n3153r.clase1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class Main2Activity extends Activity implements View.OnClickListener {

    Button boton,botonVentana3;
    AutoCompleteTextView auto;
    TextView textView;

    String[] nombre = {"Neiser","Hans", "Carmen","Jhan", "Katia","Elvis"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boton = (Button) findViewById(R.id.btnComp);
        auto = (AutoCompleteTextView) findViewById(R.id.auto);
        textView = (TextView) findViewById(R.id.textView);

        boton.setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,nombre);
        auto.setThreshold(3);
        auto.setAdapter(adapter);

//        ============================
        botonVentana3 = (Button) findViewById(R.id.btnVentana3);
        botonVentana3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnComp:
                String cambio= auto.getText().toString();
                textView.setText(cambio);
                break;
            case R.id.btnVentana3:
                Intent intent = new Intent(this,Main3Activity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}



