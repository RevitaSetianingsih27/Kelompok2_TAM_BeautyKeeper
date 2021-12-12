package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ListSkincare extends AppCompatActivity {
    private RecyclerView r_produk;
    private ArrayList<ItemModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_skincare);

        r_produk = findViewById(R.id.recyclerView);
        r_produk.setHasFixedSize(true);

        list.addAll(ItemSkincare.getListData());
        showRecyclerList();
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Menu Skincare");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    private void showRecyclerList(){
        r_produk.setLayoutManager(new LinearLayoutManager(this));
        AdapterRecyclerView listProdukAdapter = new AdapterRecyclerView(list);
        r_produk.setAdapter(listProdukAdapter);

        listProdukAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemModel produk) {
                Intent moveIntent1 = new Intent(ListSkincare.this, DetailView.class);
                moveIntent1.putExtra(DetailView.ITEM_EXTRA, produk);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
