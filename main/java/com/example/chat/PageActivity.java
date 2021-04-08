package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
public class PageActivity extends AppCompatActivity {
    private Button friend_chat_button;
    private Button chatroom_button;
    private Button apply_info_button;
    private Button self_info_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        friend_chat_button = (Button) findViewById(R.id.button_1);
        friend_chat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PageActivity.this, FriendActivity.class);
                startActivity(intent);
            }
        });


        chatroom_button = (Button) findViewById(R.id.button_2);
        chatroom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PageActivity.this, GroupActivity.class);
                startActivity(intent);
            }
        });


        apply_info_button = (Button) findViewById(R.id.button_3);
        apply_info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PageActivity.this, ApplyActivity.class);
                startActivity(intent);
            }
        });


        self_info_button = (Button) findViewById(R.id.button_4);
        self_info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PageActivity.this, SelfActivity.class);
                startActivity(intent);
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.log_out:
                new AlertDialog.Builder(this)
                        .setTitle("Log out")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("Are you sure to log out?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                在这里加入退出功能
                                PageActivity.this.finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .create().show();

                break;
        }
        return true;
    }
}