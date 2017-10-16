package com.example.p3750852.additupv1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

import static android.R.attr.button;

public class AddOsszeV1 extends AppCompatActivity {

    EditText mezo1;
    EditText mezo2;
    TextView eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ossze_v1);
    }


    int field1;
    int field2;
    int result = field1 + field2;

    mezo1 = (EditText) findViewById(R.id.edit_text1);
    mezo2 = (EditText) findViewById(R.id.edit_text2);
    eredmeny = (TextView) findViewById(R.id.eredmeny1);

   Button addup = (Button) findViewById(R.id.osszead);
    addup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            eredmeny = mezo1 + mezo2;
            countText.setText(countNumber);
        }
    });





}

