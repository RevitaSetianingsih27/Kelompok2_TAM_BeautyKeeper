package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private BottomNavigationView menu_bawah;
    ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_bawah = findViewById(R.id.menu_bawah);
        vf = findViewById(R.id.vflip);
        int images[] = {
                R.drawable.slide11,R.drawable.slide12,R.drawable.slide13,
                R.drawable.slide14,R.drawable.slide15
        };
        menu_bawah.setOnNavigationItemSelectedListener(this);
        for (int image:images) {
            flipperImage(image);
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.profil:
                Intent intent = new Intent(this, MenuProfil.class);
                startActivity(intent);
                break;
            case R.id.home:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
            case R.id.trending:
                Intent intent3 = new Intent(this, Trending.class);
                startActivity(intent3);
                break;
        }
        return true;
    }
    public void flipperImage (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        vf.addView(imageView);
        vf.setFlipInterval(4000);
        vf.setAutoStart(true);
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setInAnimation(this, android.R.anim.slide_out_right);

    }
    public void skincaremenu(View v){
        Intent intent = new Intent(this, ListSkincare.class);
        startActivity(intent);
    }
    public void bodycaremenu(View v){
        Intent intent = new Intent(this, ListBodycare.class);
        startActivity(intent);
    }
    public void haircaremenu(View v){
        Intent intent = new Intent(this, ListHaircare.class);
        startActivity(intent);
    }
    public void makeupmenu(View v){
        Intent intent = new Intent(this, ListMakeup.class);
        startActivity(intent);
    }
}