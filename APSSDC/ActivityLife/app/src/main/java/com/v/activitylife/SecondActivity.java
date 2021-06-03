package com.v.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("FIRST","2nd Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("FIRST","2nd Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("FIRST","2nd Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("FIRST","2nd Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("FIRST","2nd Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("FIRST","2nd Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("FIRST","2nd Activity Destroyed");
    }
}