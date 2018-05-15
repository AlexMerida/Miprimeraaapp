package com.teaching.android.miprimeraapp;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText ageEditText;
    private RadioButton manRadioButton;
    private RadioButton womanRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);



        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        ageEditText = findViewById(R.id.edad);
        ageEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    new DatePickerDialog(ProfileActivity.this,
                            new DatePickerDialog.OnDateSetListener() {
                                @Override
                                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                    ageEditText.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                                }
                            },1992,12,6).show();
                }
            }
        });
        manRadioButton = findViewById(R.id.man);
        womanRadioButton = findViewById(R.id.woman);
    }
    public void Guardar (View view){
        Log.d("ProfileActivity","UserName "+ usernameEditText.getText());
        Log.d("ProfileActivity","Email "+ emailEditText.getText());
        Log.d("ProfileActivity","Password "+ passwordEditText.getText());
        Log.d("ProfileActivity","Age "+ ageEditText.getText());
        if (manRadioButton.isChecked()){
            Log.d("ProfileActivity","Genre "+ manRadioButton.getText());
        }
        else{
            Log.d("ProfileActivity","Genre "+ womanRadioButton.getText());
        }
    }
    public void Borrar (View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setMessage(R.string.dialog_message)
                .setTitle(R.string.dialog_title)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton(R.string.not, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile_menu,menu);
        return true;
    }

  //  @Override
 //   public boolean onOptionsItemSelected (MenuItem item) {
 //       switch (item.getItemId(save)) {
 //           Log.d("ProfileActivity", "UserName " + usernameEditText.getText());
 //           Log.d("ProfileActivity", "Email " + emailEditText.getText());
 //           Log.d("ProfileActivity", "Password " + passwordEditText.getText());
 //           Log.d("ProfileActivity", "Age " + ageEditText.getText());
 //           if (manRadioButton.isChecked()) {
 //               Log.d("ProfileActivity", "Genre " + manRadioButton.getText());
 //           } else {
 //               Log.d("ProfileActivity", "Genre " + womanRadioButton.getText());
 //           }
 //       }
 //       switch (item.getItemId()) {
 //       }
 //   }
}
