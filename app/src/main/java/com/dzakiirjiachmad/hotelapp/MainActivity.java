package com.dzakiirjiachmad.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://pantainesia.com/wp-content/uploads/2021/01/Pantai-Samudra-Indah-Bengkayang.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}