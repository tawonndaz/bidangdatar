package com.jimmy.bidangdatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tampil (View View)
    {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);
    }
    public void tampil2 (View View)
    {
        Intent i = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(i);
    }
    public void tampil3 (View View)
    {
        Intent i = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(i);
    }


}