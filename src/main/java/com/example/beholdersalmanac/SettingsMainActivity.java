package com.example.beholdersalmanac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsMainActivity extends AppCompatActivity {

    private Button btnMainL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_main);


        btnMainL = (Button) findViewById(R.id.btnMainL);
        btnMainL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goMainMenu();
            }
        });

    }

    private void goMainMenu(){
        Intent intent = new Intent(SettingsMainActivity.this, MainMenuActivity.class);
        this.startActivity(intent);
    }
}