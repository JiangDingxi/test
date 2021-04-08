package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_goto_register;
    private Button  btn_goto_signIn;
    private TextView tvStatus;
    private TextView tvId;
    private static final int REQUEST_REGISTER_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_goto_register = (Button)findViewById(R.id.btn_goto_register);
        btn_goto_signIn = (Button)findViewById(R.id.btn_goto_signIn);
        tvStatus = findViewById(R.id.tv_status);
        tvId = findViewById(R.id.tv_id);

        btn_goto_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_goto_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }

}