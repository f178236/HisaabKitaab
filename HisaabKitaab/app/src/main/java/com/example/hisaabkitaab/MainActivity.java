package com.example.hisaabkitaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_add=findViewById(R.id.activity_main_btn_add);
        Button btn_edit=findViewById(R.id.activity_main_btn_edit);
        Button btn_delete=findViewById(R.id.activity_main_btn_delete);
        Button btn_show=findViewById(R.id.activity_main_btn_show);

        btn_add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
        btn_edit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);

            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);

            }
        });
        btn_show.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent);

            }
        });
    }
}
