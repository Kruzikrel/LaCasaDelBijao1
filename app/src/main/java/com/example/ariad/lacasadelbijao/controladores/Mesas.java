package com.example.ariad.lacasadelbijao.controladores;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ariad.lacasadelbijao.R;

public class Mesas extends AppCompatActivity {

    Button btn_mesa1,btn_mesa2,btn_mesa3,btn_mesa4,btn_mesa5,btn_mesa6
            ,btn_mesa7,btn_mesa8,btn_mesa9,btn_mesa10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesas);


        btn_mesa1 = (Button) findViewById(R.id.btn_mesa1);
        btn_mesa2 = (Button) findViewById(R.id.btn_mesa2);
        btn_mesa3 = (Button) findViewById(R.id.btn_mesa3);
        btn_mesa4 = (Button) findViewById(R.id.btn_mesa4);
        btn_mesa5 = (Button) findViewById(R.id.btn_mesa5);
        btn_mesa6 = (Button) findViewById(R.id.btn_mesa6);
        btn_mesa7 = (Button) findViewById(R.id.btn_mesa7);
        btn_mesa8 = (Button) findViewById(R.id.btn_mesa8);
        btn_mesa9 = (Button) findViewById(R.id.btn_mesa9);
        btn_mesa10 = (Button) findViewById(R.id.btn_mesa10);


        btn_mesa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });
        btn_mesa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });
        btn_mesa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });
        btn_mesa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });
        btn_mesa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });        btn_mesa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });        btn_mesa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });        btn_mesa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });        btn_mesa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });
        btn_mesa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });
        btn_mesa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        Mesas.this,Opciones.class);

                startActivity(mesas);

            }
        });







    }

}
