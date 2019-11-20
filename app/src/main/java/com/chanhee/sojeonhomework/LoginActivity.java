package com.chanhee.sojeonhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText editid,editPw;
    Button signup,signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editid=findViewById(R.id.ID);
        editPw=findViewById(R.id.PW);
        signin=findViewById(R.id.signIn);
        signup=findViewById(R.id.signUp);

    }
}
