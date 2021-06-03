package com.v.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("FIRST","1st Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("FIRST","1st Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("FIRST","1st Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("FIRST","1st Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("FIRST","1st Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("FIRST","1st Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("FIRST","1st Activity Destroyed");
    }
    public void next(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}