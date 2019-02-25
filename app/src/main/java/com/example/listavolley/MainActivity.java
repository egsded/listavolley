package com.example.listavolley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView ltf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ltf = findViewById(R.id.lta_1);
    }

    public void click_boton(View view) {
        JsonArrayRequest jar = new JsonArrayRequest(Request.Method.GET, "http://nuevo.rnrsiilge-org.mx/lista", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Gson g = new Gson();
                Type t = new TypeToken<List<persona>>(){}.getType();
                List<persona> lp = g.fromJson(response.toString(),t);
                adaptadorpersona aper = new adaptadorpersona(getApplicationContext(), lp);
                ltf.setAdapter(aper);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
    });
        volleys.getInstance(this).getrequestQ().add(jar);
    }
}
