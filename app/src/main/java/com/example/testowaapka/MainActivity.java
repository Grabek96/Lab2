package com.example.testowaapka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Testowa apka",  "metoda onCreate" );
        Toast.makeText(this, "Metoda onCreate", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Log.d("Testowa apka",  "metoda onStart" );
        Toast.makeText(this, "Metoda onStart", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Log.d("Testowa apka",  "metoda onResume");
        Toast.makeText(this,"Metoda onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.d("Testowa apka",  "metoda onPause");
        Toast.makeText(this,"Metoda onPause",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.d("Testowa apka",  "metoda onStop");
        Toast.makeText(this,"Metoda onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
    super.onRestart();
        setContentView(R.layout.activity_main);
        Log.d("Testowa apka",  "metoda onRestart");
        Toast.makeText(this,"Metoda onRestart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.d("Testowa apka",  "metoda onDestroy");
        Toast.makeText(this,"Metoda onDestroy",Toast.LENGTH_LONG).show();
    }
}