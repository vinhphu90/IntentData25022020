package com.examplevinhphutvp.intentdata25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
//        if (intent != null){
//           String value = intent.getStringExtra("chuoi");
//           Log.d("BBB",value);
//       }
//        if (intent != null){
//            String [] arrayStrings = intent.getStringArrayExtra("array");
//            Log.d("BBB", arrayStrings.length + "");
//        }
//        if (intent != null){
//            ArrayList<String> arrayList = intent.getStringArrayListExtra("arraylist");
//            Log.d("BBB",  arrayList.size() + "");
//        }
        if (intent != null){
            Animal meo = intent.getParcelableExtra("Object");
            Log.d("BBB",  meo.Weight + "");
        }
    }
}
