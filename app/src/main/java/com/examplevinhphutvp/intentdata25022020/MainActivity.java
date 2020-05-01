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
    Button mBtnString , mBtnArray,mBtnArrayList,mBtnObject, mBtnSerializable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);
        mBtnArrayList = findViewById(R.id.buttonArrayList);
        mBtnObject = findViewById(R.id.buttonObject);
        mBtnSerializable = findViewById(R.id.buttonSerializable);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("chuoi", "xin chao Main2 ");
//                startActivity(intent);
                sendItenData("chuoi", "xin chao Main2 ");
            }
        });
        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  String [] strings = {"A", "B", "C", "D","E","F"};
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("array", strings);
//                startActivity(intent);
                sendItenData("array", strings);
            }
        });
        mBtnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> arrayList = new ArrayList<>(
                        Arrays.asList("A","B","c","D")
                );
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("arraylist", arrayList);
//                startActivity(intent);
                sendItenData("arraylist", arrayList);
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
        mBtnSerializable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Business business = new Business();
                business.address = "Quan 1";
                business.Name = "Cong ty trach nhiem huu han 1 thanh vien";
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("serializable",business );
                startActivity(intent);
            }
        });

    }
    //geneate type
    public <T> void sendItenData(String key , T value){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        if (value instanceof String){
            intent.putExtra(key,(String) value);
        }
        if (value instanceof String[]){
            intent.putExtra(key,(String[]) value);
        }
        if (value instanceof ArrayList<?>)
            if (value instanceof Object){
                intent.putExtra(key,(ArrayList<String>) value);
            }
        startActivity(intent);
    }
}
