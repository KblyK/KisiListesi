package com.kubilaykocabal.android.kisilistesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView mRecyclerView;
    private List<person> person_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        mRecyclerView.setLayoutManager(layoutManager);

        person_list = new ArrayList<person>();
        person_list.add(new person("Alper Beyler",23 ));
        person_list.add(new person("Taha Kırca", 25 ));
        person_list.add(new person("Ayşe Fatma", 35));
        person_list.add(new person("Ahmet Ali", 60));
        person_list.add(new person("Pelin Pelin", 20));
        person_list.add(new person("Osman Osman", 33));
        person_list.add(new person("Sevgi Bütün", 40));
        person_list.add(new person("Abulkadir Yavaş", 33));
        person_list.add(new person("Ayşe Mutlu", 36));
        person_list.add(new person("Ahmetcan Can", 28));
        person_list.add(new person("Fatma Can", 28));
        person_list.add(new person("Mustafa Altın", 28));
        person_list.add(new person("Caner Yalçın", 18));
        person_list.add(new person("Gönül Yalçın", 48));

        adapter adapter_items = new adapter(person_list);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter_items);



    }
}
