package com.example.hisaabkitaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void mainActivity(View v){
        Intent i=new Intent(Main4Activity.this,MainActivity.class);
        startActivity(i);

    }
}
