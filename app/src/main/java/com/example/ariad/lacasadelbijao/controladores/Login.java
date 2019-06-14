package com.example.ariad.lacasadelbijao.controladores;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AlertDialog;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


import com.example.ariad.lacasadelbijao.Conexiones.PeticionLogin;
import com.example.ariad.lacasadelbijao.R;

public class Login extends AppCompatActivity {

    Button btn_Ingresar;
    TextView et_Usuario,et_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btn_Ingresar = (Button) findViewById(R.id.btn_ingresar);
        et_Usuario=findViewById(R.id.et_usuario);
        et_Password=findViewById(R.id.et_contra);


        btn_Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               final String username= et_Usuario.getText().toString();
                final String password= et_Password.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                                builder.setMessage("Bienvenido")
                                        .setNegativeButton("Exit", null)
                                        .create().show();

                                Intent mesas = new Intent(
                                        Login.this,disponibilidad.class);

                                startActivity(mesas);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                                builder.setMessage("Error logueo")
                                        .setNegativeButton("Retry", null)
                                        .create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };

                PeticionLogin loginRequest = new PeticionLogin(username,password,responseListener);

                RequestQueue queue = Volley.newRequestQueue(Login.this);
                queue.add(loginRequest);



            }
        });


    }



}
