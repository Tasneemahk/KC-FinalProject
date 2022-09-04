package com.example.tal3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        EditText emailLogIn = findViewById(R.id.emailLogIn);
        EditText passwordLogIn = findViewById(R.id.passwordLogIn);
        Button logInBtnLogInPage= findViewById(R.id.logInBtnLogInPage);
        ImageView profIMGUpload = findViewById(R.id.profIMG);
    }
}