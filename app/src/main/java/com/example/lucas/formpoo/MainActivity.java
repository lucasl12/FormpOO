package com.example.lucas.formpoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lucas.formpoo.form.Formulario;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText nomef,descf,dataif,dataff,quantidadef;
    String nomeformulario,descricaoformulario,datainicio,datafinal;
    int quantidadedep;
    Button criaf;
    Formulario f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias para a primeira tela
        nomef = (EditText)findViewById(R.id.nomef);
        descf = (EditText)findViewById(R.id.descf);
        dataif = (EditText)findViewById(R.id.datainicio);
        dataff = (EditText)findViewById(R.id.datafinal);
        quantidadef = (EditText)findViewById(R.id.quantidadef);
        criaf = (Button)findViewById(R.id.criarf);

        criaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // salvando nas variaveis convertendo;
                nomeformulario = nomef.getText().toString();
                descricaoformulario = descf.getText().toString();
                datainicio= dataif.getText().toString();
                datafinal = dataff.getText().toString();
                quantidadedep = Integer.parseInt(quantidadef.getText().toString());



            }
        });




    }



}
