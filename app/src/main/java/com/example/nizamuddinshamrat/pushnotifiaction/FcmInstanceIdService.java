package com.example.nizamuddinshamrat.pushnotifiaction;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FcmInstanceIdService extends FirebaseInstanceIdService {

   /* @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String recent_token = FirebaseInstanceId.getInstance().getToken();

        SharedPreferences sharedPreferences = getApplicationContext().
                getSharedPreferences(getString(R.string.FCM_PREF),Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Log.d("token",recent_token);
        Toast.makeText(this, ""+recent_token, Toast.LENGTH_SHORT).show();
        editor.putString(getString(R.string.FCM_TOKEN),recent_token);
        editor.commit();
    }*/

}
