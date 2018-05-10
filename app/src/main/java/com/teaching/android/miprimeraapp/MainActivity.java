package com.teaching.android.miprimeraapp;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;

public class MainActivity extends AppCompatActivity {
    public void onClick(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("Segundo","numero 2");
        startActivity(intent);
    }
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
    public void onClick2(View view){
        startActivity(intent);
    }
    Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("content://contacts/people/2"));
    public void onClick3(View view){
        startActivity(intent2);
    }
    public void onClick4 (View view)
    {
        Intent intent3 = new Intent(this, ProfileActivity.class);
        intent3.putExtra("Perfil", "Formulario");
        startActivity(intent3);
    }
    public void onClick5 (View view)
    {
        Intent intent4 = new Intent(this, Image.class);
        intent4.putExtra("Imagen", "Imagen");
        startActivity(intent4);
    }
    public void onClick6 (View view)
    {
        Intent intent4 = new Intent(this, ListActivity.class);
        intent4.putExtra("Lista", "Lista");
        startActivity(intent4);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.d("MainActivity","onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        android.util.Log.d("MainActivity","onStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        android.util.Log.d("MainActivity","onPause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        android.util.Log.d("Mainactivity","onResume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        android.util.Log.d("MainActivity","onStop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        android.util.Log.d("MainActivity","onRestart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        android.util.Log.d("MainActivity","onDestroy");
    }
}
