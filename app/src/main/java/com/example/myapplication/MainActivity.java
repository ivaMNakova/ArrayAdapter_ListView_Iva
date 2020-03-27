package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Animal> arrayList = new ArrayList<Animal>();
        arrayList.add(new Animal("Awkward cat"));
        arrayList.add(new Animal("Sad cat"));
        arrayList.add(new Animal("Quarantine cat"));


        AnimalsAdapter adapter = new AnimalsAdapter(this, arrayList);

        ListView listView = findViewById(R.id.lv);

        listView.setAdapter((ListAdapter) adapter);
    }
}
