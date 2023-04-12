package com.example.beholdersalmanac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class CharacterSheet extends AppCompatActivity {

    private Button btnNewCharacter;
    private Button btnMainMenu3;
    private Button btnLoad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_sheet);

        Button btnNewCharacter = (Button) findViewById(R.id.btnNewCharacter);
        btnNewCharacter.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   goNewCharacter();
                                               }
                                           });
        Button btnLoad = (Button) findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goLoad();
            }
        });



        Button btnMainMenu3 = (Button) findViewById(R.id.btnMainMenu3);
        btnMainMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMainMenu();
            }
        });
    }

    private void goMainMenu() {
        Intent intent = new Intent(CharacterSheet.this, MainMenuActivity.class);
        this.startActivity(intent);
    }
    private void goNewCharacter() {
        Intent intent = new Intent(CharacterSheet.this, NewCharacterActivity.class);
        this.startActivity(intent);
    }
    private void goLoad(){
        Intent intent = new Intent(CharacterSheet.this, ExistingCharactersActivity.class);
        this.startActivity(intent);
    }

}

