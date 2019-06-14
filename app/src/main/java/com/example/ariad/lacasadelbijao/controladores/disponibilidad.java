package com.example.ariad.lacasadelbijao.controladores;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.ariad.lacasadelbijao.R;

public class disponibilidad extends AppCompatActivity {

    Button btn_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disponibilidad);


        btn_disp = (Button) findViewById(R.id.btn_dispo);
        btn_disp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesas = new Intent(
                        disponibilidad.this,Mesas.class);

                startActivity(mesas);

            }
        });

    }

}
