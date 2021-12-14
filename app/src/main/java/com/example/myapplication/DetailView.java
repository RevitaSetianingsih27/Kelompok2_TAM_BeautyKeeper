package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailView extends AppCompatActivity {


    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_harga);
        TextView tvMore = findViewById(R.id.tv_item_detail);
        ItemModel dataItem = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (dataItem != null) {
            Glide.with(this)
                    .load(dataItem.getImage())
                    .into(imgItemPhoto);
            tvName.setText(dataItem.getName());
            tvMore.setText(dataItem.getDetail());
            tvDeskripsi.setText(dataItem.getType());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}