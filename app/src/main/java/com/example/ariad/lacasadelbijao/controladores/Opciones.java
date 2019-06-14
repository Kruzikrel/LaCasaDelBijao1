package com.example.ariad.lacasadelbijao.controladores;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ariad.lacasadelbijao.R;

public class Opciones extends AppCompatActivity {

    Button btn_listaplato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        btn_listaplato= (Button) findViewById(R.id.btn_listaplatos);
        btn_listaplato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Opciones.this, listado_platos.class));
            }
        });

        FloatingActionButton btn_Pedido = (FloatingActionButton) findViewById(R.id.btn_pedido);
        btn_Pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent platos = new Intent(
                        Opciones.this,Pedido.class);

                startActivity(platos);
            }
        });

    }

}
