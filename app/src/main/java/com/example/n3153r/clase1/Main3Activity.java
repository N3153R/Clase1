package com.example.n3153r.clase1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends Activity implements View.OnClickListener {

    AutoCompleteTextView autocomplete;
    Button botonAutoComp, botonVentana4;
    TextView textoAutoComp;
    String[] CIUDADES={"Burgos", "Soria","Barcelona","Sevilla","Santander"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        autocomplete = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        botonVentana4 =(Button) findViewById(R.id.btnVentana4);
        botonVentana4.setOnClickListener(this);

//        Auto completar texto
//        ====================================
        botonAutoComp = (Button) findViewById(R.id.btnAutoComp);
        botonAutoComp.setOnClickListener(this);

        autocomplete=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        textoAutoComp= (TextView) findViewById(R.id.txtAutoComp);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,CIUDADES);

        autocomplete.setThreshold(1);
        autocomplete.setAdapter(adapter);
//============================
//        textoAutoComp =(TextView) findViewById(R.id.txtAutoComp);
//
//        Intent intent = getIntent();
//
//        Bundle bundle = intent.getExtras();
//
//        if(bundle!=null){
//            String cadena = (String) bundle.get("DATO");
//            textoAutoComp.setText(cadena);
//
//        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAutoComp:
                String cambio= autocomplete.getText().toString();
                textoAutoComp.setText(cambio);
                break;
            case R.id.btnVentana4:
                Intent intent = new Intent(this,Main4Activity.class);
                startActivity(intent);
                break;
        }
    }
}
