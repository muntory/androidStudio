package org.techtown.challenge03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ScrollView scrollView;
    ScrollView scrollView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        scrollView2 = findViewById(R.id.scrollView2);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        scrollView.setHorizontalScrollBarEnabled(true);
        scrollView2.setHorizontalScrollBarEnabled(true);
    }



    public void onButtonDownClicked(View v) {
        showImageLower();
    }



    public void onButtonUpClicked(View v) {
        showImageUpper();
    }



    private void showImageLower() {
        imageView2.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.INVISIBLE);
    }



    private void showImageUpper() {
        imageView2.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.VISIBLE);
    }
}