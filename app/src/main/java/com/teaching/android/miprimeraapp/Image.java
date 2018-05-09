package com.teaching.android.miprimeraapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }
    Intent intentA = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
    public void onClickA(View view){
        startActivity(intentA);
    }
}
