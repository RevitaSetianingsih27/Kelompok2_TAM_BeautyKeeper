package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ListHaircare extends AppCompatActivity {
    private RecyclerView r_haircare;
    private ArrayList<ItemModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_skincare);

        r_haircare = findViewById(R.id.recyclerView);
        r_haircare.setHasFixedSize(true);

        list.addAll(ItemHaircare.getListData());
        showRecyclerList();
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Menu Haircare");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    private void showRecyclerList(){
        r_haircare.setLayoutManager(new LinearLayoutManager(this));
        AdapterRecyclerView listProdukAdapter = new AdapterRecyclerView(list);
        r_haircare.setAdapter(listProdukAdapter);

        listProdukAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemModel produk) {
                Intent moveIntent1 = new Intent(ListHaircare.this, DetailView.class);
                moveIntent1.putExtra(DetailView.ITEM_EXTRA, produk);
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