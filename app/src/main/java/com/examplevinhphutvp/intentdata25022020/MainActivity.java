package com.examplevinhphutvp.intentdata25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button mBtnString , mBtnArray,mBtnArrayList,mBtnObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);
        mBtnArrayList = findViewById(R.id.buttonArrayList);
        mBtnObject = findViewById(R.id.buttonObject);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("chuoi", "xin chao Main2 ");
                startActivity(intent);
            }
        });
        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] strings = {"A", "B", "C", "D","E","F"};
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("array", strings);
                startActivity(intent);
            }
        });
        mBtnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> arrayList = new ArrayList<>(
                        Arrays.asList("A","B","c","D")
                );
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("arraylist", arrayList);
                startActivity(intent);
            }
        });
        mBtnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Animal> animals = new ArrayList<>();
                Animal meo = new Animal();
                meo.Name="con meo";
                meo.Weight= 2 ;
                animals.add(meo);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Object",animals );
                startActivity(intent);
            }
        });

    }
}
