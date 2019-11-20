package com.chanhee.sojeonhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editId,editPw;
    Button signupp;
    String id,pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editId = findViewById(R.id.editID);
        editPw = findViewById(R.id.editPw);
        signupp = findViewById(R.id.signUpp);
        id = editId.getText().toString();
        pw = editPw.getText().toString();
        signupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
    }
}
