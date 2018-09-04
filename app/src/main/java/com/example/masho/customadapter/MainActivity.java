package com.example.masho.customadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Model> arrayList = new ArrayList<>();
        arrayList.add(new Model("Hammad","22",R.drawable.img));
        arrayList.add(new Model("BLACK NOMAD","22",R.drawable.img));
        arrayList.add(new Model("ABID XHAKA","22",R.drawable.img));
        arrayList.add(new Model("daniyal","22",R.drawable.img));
        arrayList.add(new Model("Mashood","22",R.drawable.img));
        arrayList.add(new Model("EXO","22",R.drawable.img));
        arrayList.add(new Model("BHOPU","22",R.drawable.img));
        arrayList.add(new Model("SHADY","22",R.drawable.img));
        CustomAdapter adapter = new CustomAdapter(this,arrayList);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                    startActivity(intent);

            }
        });
    }
}
