package com.example.hisaabkitaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    public Expanses expanses;
    DatabaseHandler db = new DatabaseHandler(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText amount=findViewById(R.id.activity_main2_edit_text_amount);
        final Spinner category=findViewById(R.id.activity_main2_spinner_category);
        final EditText date=findViewById(R.id.activity_main2_date);
        final Button add=findViewById(R.id.activity_main2_btn_add);





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expanses.setAmount(Double.parseDouble(amount.getText().toString()));
                expanses.setCategory(category.getSelectedItem().toString());

                    expanses.setDate(date.getText().toString());

                db.addExpanse(expanses);
            }
        });
    }

    public void mainActivity(View v){
        Intent i=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(i);

    }
}
