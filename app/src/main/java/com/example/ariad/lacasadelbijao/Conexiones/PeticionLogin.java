package com.example.ariad.lacasadelbijao.Conexiones;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class PeticionLogin extends StringRequest{

private static final String LOGIN_PETICION_URL="http://192.168.1.84/Android/Plogin.php";
    private Map<String,String> params;
    public  PeticionLogin( String User,String Password, Response.Listener<String> listener){
        super(Request.Method.POST,LOGIN_PETICION_URL,listener,null);
        params=new HashMap<>();
        params.put("USU_Usuario",User);
        params.put("USU_Password",Password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
