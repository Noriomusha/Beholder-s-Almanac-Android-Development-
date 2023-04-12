package com.example.beholdersalmanac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.beholdersalmanac.ui.login.LoginActivity;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainMenuActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        player = MediaPlayer.create(this, R.raw.beholders_almanac_bgm);
        player.start();

        Button btnSignIn=(Button) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSignIn();
            }
        });
        // Adds a listener to the button to take you to the character page
        Button btnCharacter=(Button) findViewById(R.id.btnCharacter);
        btnCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goCharacter();
            }
        });
        Button btnDice=(Button) findViewById(R.id.btnDice);
        btnDice.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           goDice();
                                       }
                                   }
        );

        Button btnSettings = (Button) findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSettings();
            }
        });

    }


    private void goCharacter() {
        Intent intent = new Intent(MainMenuActivity.this, CharacterSheet.class);
        this.startActivity(intent);
    }

    private void goDice() {
        Intent intent = new Intent(MainMenuActivity.this, DiceRoller.class);
        this.startActivity(intent);
    }

    private void goSignIn() {
        Intent intent = new Intent(MainMenuActivity.this, LoginActivity.class);
        this.startActivity(intent);
    }

    private void goSettings(){
        Intent intent = new Intent(MainMenuActivity.this, SettingsMainActivity.class);
        this.startActivity(intent);
    }

    public void on(View V){
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.beholders_almanac_bgm);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void off(View v){
        stopPlayer();

    }

    private void stopPlayer(){
        if (player != null){
            player.release();
            player = null;
            Toast.makeText(this, "Music Stopped", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected  void onStop(){
        super.onStop();
        stopPlayer();
    }
}