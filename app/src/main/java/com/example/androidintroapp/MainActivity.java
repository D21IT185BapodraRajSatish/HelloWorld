package com.example.androidintroapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("------------------------------------>  OnCreate","On Create Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("------------------------------------>  OnStart","On Start Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("------------------------------------>  OnResume","On Resume Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("------------------------------------>  OnPause","On Pause Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("------------------------------------>  OnStop","On Stop Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("------------------------------------>  OnRestart","On Restart Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("------------------------------------>  OnDestroy","On Destroy Invoked");
    }
}