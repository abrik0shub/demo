package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
    }
    public void createAcc(View view){
        Intent intent = new Intent(SignIn.this, SignUp.class);
        startActivity(intent);
    }

    public void maps(View view){
        Intent intent = new Intent(SignIn.this, Menus.class);
        startActivity(intent);
    }
}
