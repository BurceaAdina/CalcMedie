package com.example.ultima;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PaginaUtilizator extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private EditText number3;
    private EditText number4;
    private EditText number5;
    private EditText number6;
    private EditText number7;
    private EditText number8;
    private EditText number9;
    private EditText number10;
    private EditText number11;
    private EditText number12;
    private EditText number13;
    private EditText number14;
    private EditText number15;
    private EditText number16;
    private Button egals;
    private TextView rezultats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_utilizator);

        number1= (EditText) findViewById(R.id.num1);
        number2= (EditText) findViewById(R.id.num2);
        number3= (EditText) findViewById(R.id.num3);
        number4= (EditText) findViewById(R.id.num4);
        number5= (EditText) findViewById(R.id.num5);
        number6= (EditText) findViewById(R.id.num6);
        number7= (EditText) findViewById(R.id.num7);
        number8= (EditText) findViewById(R.id.num8);
        number9= (EditText) findViewById(R.id.num9);
        number10= (EditText) findViewById(R.id.num10);
        number11= (EditText) findViewById(R.id.num11);
        number12= (EditText) findViewById(R.id.num12);
        number13= (EditText) findViewById(R.id.num13);
        number14= (EditText) findViewById(R.id.num14);
        number15= (EditText) findViewById(R.id.num15);
        number16= (EditText) findViewById(R.id.num16);

        egals= (Button) findViewById(R.id.egal);
        rezultats= (TextView) findViewById(R.id.rezultat);

        egals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Number1 = Integer.parseInt(number1.getText().toString());
                int Number2 = Integer.parseInt(number2.getText().toString());
                int Number3= Integer.parseInt(number3.getText().toString());
                int Number4 = Integer.parseInt(number4.getText().toString());
                int Number5 = Integer.parseInt(number5.getText().toString());
                int Number6 = Integer.parseInt(number6.getText().toString());
                int Number7 = Integer.parseInt(number7.getText().toString());
                int Number8= Integer.parseInt(number8.getText().toString());
                int Number9 = Integer.parseInt(number9.getText().toString());
                int Number10 = Integer.parseInt(number10.getText().toString());
                int Number11 = Integer.parseInt(number11.getText().toString());
                int Number12 = Integer.parseInt(number12.getText().toString());
                int Number13= Integer.parseInt(number13.getText().toString());
                int Number14 = Integer.parseInt(number14.getText().toString());
                int Number15 = Integer.parseInt(number15.getText().toString());
                int Number16 = Integer.parseInt(number16.getText().toString());


                float sumCredite = Number2 + Number4 + Number6 + Number8 + Number10 + Number12 + Number14 + Number16;
                float sumTotala = (Number1 * Number2) + (Number3 * Number4) +(Number5 * Number6) +(Number7 * Number8) +(Number9 * Number10) +(Number11 * Number12) +(Number13 * Number14) +(Number15 * Number16) ;
                float rez = (sumTotala/sumCredite);
                rezultats.setText("Answer: " + String.valueOf(rez));

            }
        });



    }
}