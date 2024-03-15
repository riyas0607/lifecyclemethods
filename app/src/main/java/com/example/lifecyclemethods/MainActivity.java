package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "OnCreate called", Toast.LENGTH_LONG).show();
    }
    protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "OnStart called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast toast = Toast.makeText(getApplicationContext(), "OnRestart called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "OnStop called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onPause(){
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "OnPause called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "OnDestroy called", Toast.LENGTH_LONG);
        toast.show();
    }
}
