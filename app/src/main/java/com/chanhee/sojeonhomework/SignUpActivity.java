package com.chanhee.sojeonhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
   TextView textView;
   String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
       textView=findViewById(R.id.textView);
       Intent intent=getIntent();
       id=intent.getStringExtra("id");
       if(id==null){
           Toast.makeText(this, "오류 입니다", Toast.LENGTH_SHORT).show();
       }else{

           textView.setText(id+"님 반갑습니다");
       }




    }
}
