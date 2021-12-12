package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ListMakeup extends AppCompatActivity {
    private RecyclerView r_makeup;
    private ArrayList<ItemModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_skincare);

        r_makeup = findViewById(R.id.recyclerView);
        r_makeup.setHasFixedSize(true);

        list.addAll(ItemMakeup.getListData());
        showRecyclerList();
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Menu Make Up");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    private void showRecyclerList(){
        r_makeup.setLayoutManager(new LinearLayoutManager(this));
        AdapterRecyclerView listProdukAdapter = new AdapterRecyclerView(list);
        r_makeup.setAdapter(listProdukAdapter);

        listProdukAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemModel makanan) {
                Intent moveIntent1 = new Intent(ListMakeup.this, DetailView.class);
                moveIntent1.putExtra(DetailView.ITEM_EXTRA, makanan);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    }