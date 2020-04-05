package com.example.hisaabkitaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        DatabaseHandler db = new DatabaseHandler(this);
        final TextView tv=findViewById(R.id.textView14);

        List l=db.getAllExpanseList();
        Log.i("Message",l.toString());
    }
    public void mainActivity(View v){
        Intent i=new Intent(Main5Activity.this,MainActivity.class);
        startActivity(i);

    }
}
