package com.andromojo.recyclerviewfooter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> data = new ArrayList<>();
        data.add("Apple");
        data.add("Microsoft");
        data.add("Google");
        data.add("Amazon");
        data.add("HP");
        data.add("Dell");
        data.add("Tesla");
        data.add("Samsung");
        data.add("Sony");
        data.add("Intel");
        data.add("IBM");
        data.add("LG");
        data.add("Panasonic");
        data.add("Facebook");
        data.add("Cisco");
        data.add("Lenovo");

        recyclerView.setAdapter(new FooterAdapter(data, this));
    }
}