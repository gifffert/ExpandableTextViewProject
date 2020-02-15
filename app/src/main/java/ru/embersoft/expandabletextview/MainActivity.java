package ru.embersoft.expandabletextview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items,this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //i am prepare strings for this project
        items.add(new Item(R.drawable.coffee01,getString(R.string.coffee_25_title),getString(R.string.coffee_25_desc)));
        items.add(new Item(R.drawable.coffee02,getString(R.string.coffee_26_title),getString(R.string.coffee_26_desc)));
        items.add(new Item(R.drawable.coffee03,getString(R.string.coffee_27_title),getString(R.string.coffee_27_desc)));
        items.add(new Item(R.drawable.coffee04,getString(R.string.coffee_28_title),getString(R.string.coffee_28_desc)));
        items.add(new Item(R.drawable.coffee05,getString(R.string.coffee_29_title),getString(R.string.coffee_29_desc)));
    }
}
