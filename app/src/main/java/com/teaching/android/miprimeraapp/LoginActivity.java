package com.teaching.android.miprimeraapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
    }
    public void toLogin (View view){

        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (TextUtils.isEmpty(username)){
            usernameEditText.setError(getString(R.string.userError));
        }
        else if (TextUtils.isEmpty(password)){
            passwordEditText.setError(getString(R.string.passError));
        }
        else{
            Intent registerIntent = new Intent();
            startActivity(registerIntent);
        }
    }

    public void toRegister (View view){
        Intent registerIntent = new Intent(this,ProfileActivity.class);
        startActivity(registerIntent);
    }
    public void toCancel (View view){
        usernameEditText.setText("");
    }
}
