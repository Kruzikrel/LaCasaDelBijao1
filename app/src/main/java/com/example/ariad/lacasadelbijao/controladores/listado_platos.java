package com.example.ariad.lacasadelbijao.controladores;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import com.example.ariad.lacasadelbijao.R;
import com.example.ariad.lacasadelbijao.modelos.modeloPromocion;

public class listado_platos extends AppCompatActivity {

    ListView listadop;   AdaptadorPlatos adaptadorPlatos;
    modeloPromocion mp = new modeloPromocion();    ProgressDialog barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_platos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listadop = (ListView) findViewById(R.id.lst_listaplatos);
        new Avance().execute();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    class Avance extends AsyncTask<String, Integer, Integer> {
        @Override
        protected void onPreExecute() {   //Antes de la ejecucion del proceso
            barra = new ProgressDialog(listado_platos.this);
            barra.setTitle("Avance");
            barra.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            barra.show();
        }
        @Override
        protected Integer doInBackground(String... strings) {
            adaptadorPlatos = new AdaptadorPlatos(listado_platos.this,mp.listarPlatos());
            for(int i=0;i<10; i++){
                try{ Thread.sleep(200); }catch (Exception ex){ }
            }
            return 10;
        }
        @Override
        protected void onPostExecute(Integer integer) {
            listadop.setAdapter(adaptadorPlatos);
            barra.dismiss();            super.onPostExecute(integer);
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            //actualizar durante el proceso
            super.onProgressUpdate(values);
        }
    }

}
