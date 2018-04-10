package com.example.yaya.tp3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t=(TextView)findViewById(R.id.txtcouleur);
        ImageButton imagblue=findViewById(R.id.imgblue);
        ImageButton imagrouge=findViewById(R.id.imgrouge);

        final ToggleButton togblue=findViewById(R.id.tgblue);
        final ToggleButton togjoune=findViewById(R.id.tgjaune);
        final ToggleButton togrouge=findViewById(R.id.tgrouge);

        Button appliquer=findViewById(R.id.btnapplique);

        final RadioButton rdblue=(RadioButton)findViewById(R.id.rdblue);
        final RadioButton rdjaune=(RadioButton)findViewById(R.id.rdjaune);
        RadioButton rdrouge=(RadioButton)findViewById(R.id.rdrouge);

        final RadioGroup couleur=(RadioGroup)findViewById(R.id.rdgrp);

        imagblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("");
                t.setBackgroundColor(Color.BLUE);
            }
        });
        imagrouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("");
                t.setBackgroundColor(Color.RED);
            }
        });
        togblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(togblue.isChecked()){
                    t.setText("");
                    t.setBackgroundColor(Color.BLUE);
                }
                else {
                    t.setText("");
                    t.setBackgroundColor(Color.BLACK);
                }
            }
        });
        togjoune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(togjoune.isChecked()){
                    t.setText("");
                    t.setBackgroundColor(Color.YELLOW);
                }
                else{
                    t.setText("");
                    t.setBackgroundColor(Color.BLACK);
                }
            }
        });
        togrouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(togrouge.isChecked()){
                    t.setText("");
                    t.setBackgroundColor(Color.RED);
                }
                else{
                    t.setText("");
                    t.setBackgroundColor(Color.BLACK);
                }

            }
        });
        appliquer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (R.id.rdblue==couleur.getCheckedRadioButtonId()){
                    t.setText("");
                    t.setBackgroundColor(Color.BLUE);
                }
                else{
                    if (R.id.rdjaune==couleur.getCheckedRadioButtonId()){
                        t.setText("");
                        t.setBackgroundColor(Color.YELLOW);
                    }
                    else{
                        t.setText("");
                        t.setBackgroundColor(Color.RED);
                    }
                }
            }
        });


    }
}
