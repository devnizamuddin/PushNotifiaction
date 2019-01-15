package com.example.nizamuddinshamrat.pushnotifiaction;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingleTone {

    private static MySingleTone mInstance;
    private static Context context;
    private RequestQueue requestQueue;

    private MySingleTone (Context context){
        this.context = context;
        requestQueue = getRequestQueue();
    }

    private RequestQueue getRequestQueue(){

        if (requestQueue == null){

            requestQueue = Volley.newRequestQueue(context.getApplicationContext());

        }
        return requestQueue;

    }

    public static synchronized MySingleTone getmInstance(Context context){

        if (mInstance == null){
            mInstance = new MySingleTone(context);
        }
        return mInstance;
    }
    public<T> void addToRequestQueue(Request<T>request){


        getRequestQueue().add(request);
    }
}
