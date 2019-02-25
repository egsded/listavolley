package com.example.listavolley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class volleys {
        private static volleys VS= null;
        private RequestQueue rq;

        private volleys(Context c){
            rq = Volley.newRequestQueue(c);
    }

    public static volleys getInstance(Context context){
        if (VS == null){
            VS = new volleys(context);
        }
        return VS;
    }
    public  RequestQueue getrequestQ(){
            return rq;
    }
}
