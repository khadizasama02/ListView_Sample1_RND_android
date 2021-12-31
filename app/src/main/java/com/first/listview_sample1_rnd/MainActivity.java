package com.first.listview_sample1_rnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ListView lv2;
    ListView lv3;
    Spinner sp1;
    Integer[] count = {1,2,4,5};
    Character[] alphabet = {'a','b','c','d'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= findViewById(R.id.lv);
         lv2 = findViewById(R.id.lv1);
         lv3 = findViewById(R.id.lv3);
         sp1 = findViewById(R.id.sp1);
        String[] countries =getResources().getStringArray(R.array.countries_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, countries);
        lv.setAdapter(adapter);
//        Integer[] number =getResources().getIntArray(R.array.count);

        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<Integer>(MainActivity.this,
                android.R.layout.simple_list_item_1,count);
        lv2.setAdapter(adapter1);
        ArrayAdapter<Character> adapter2 = new ArrayAdapter<Character>(MainActivity.this,
                android.R.layout.simple_list_item_1,alphabet);
        lv3.setAdapter(adapter2);
        ArrayAdapter<Integer> adapter3 = new ArrayAdapter<Integer>(MainActivity.this,
                android.R.layout.simple_list_item_1,count);
        sp1.setAdapter(adapter3);




    }
}