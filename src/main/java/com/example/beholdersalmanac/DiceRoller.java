package com.example.beholdersalmanac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DiceRoller extends AppCompatActivity implements  OnClickListener {

    private Random rng = new Random();
    private ImageView four_sided_die;
    private ImageView six_sided_die;
    private ImageView eight_sided_die;
    private ImageView ten_sided_die;
    private ImageView twelve_sided_die;
    private ImageView twenty_sided_die;
    private Integer roll;
    private TextView textOutput;
    private Button btnMainMenu2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roller);

        textOutput = (TextView) findViewById(R.id.txtOutput);
        //Four sided die
        four_sided_die = (ImageView) findViewById(R.id.img_four_sided_die);
        four_sided_die.setOnClickListener(this);
        four_sided_die.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rollfourdie();
            }
        });
        //Six sided die
        six_sided_die = (ImageView) findViewById(R.id.img_six_sided_dice);
        six_sided_die.setOnClickListener(this);
        six_sided_die.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rollsixdie();
            }
        });
        //Eight sided die
        eight_sided_die = (ImageView) findViewById(R.id.img_eight_sided_dice);
        eight_sided_die.setOnClickListener(this);
        eight_sided_die.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rolleightdie();
            }
        });
        //Ten sided die
        ten_sided_die = (ImageView) findViewById(R.id.img_ten_sided_dice);
        ten_sided_die.setOnClickListener(this);
        ten_sided_die.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rolltendie();
            }
        });
        //Twelve sided die
        twelve_sided_die = (ImageView) findViewById(R.id.img_twelve_sided_die);
        twelve_sided_die.setOnClickListener(this);
        twelve_sided_die.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rolltwelvedie();
            }
        });
        //Twenty sided die
        twenty_sided_die = (ImageView) findViewById(R.id.img_twenty_sided_die);
        twenty_sided_die.setOnClickListener(this);
        twenty_sided_die.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rolltwentydie();
            }
        });
        // Main Menu Button
        btnMainMenu2 = (Button) findViewById(R.id.btnMainMenu2);
        btnMainMenu2.setOnClickListener(this);
        Button btnMainMenu2= (Button) findViewById(R.id.btnMainMenu2);
        btnMainMenu2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goMainMenu();

        }
    });
}

    private void rollfourdie(){
        roll = rng.nextInt(4)+1;
        textOutput.setText("You rolled a "+roll);
    }
    private void rollsixdie(){
        roll = rng.nextInt(6)+1;
        textOutput.setText("You rolled a "+roll);
    }
    private void rolleightdie(){
        roll = rng.nextInt(8)+1;
        textOutput.setText("You rolled a "+roll);
    }
    private void rolltendie(){
        roll = rng.nextInt(10)+1;
        textOutput.setText("You rolled a "+roll);
    }
    private void rolltwelvedie(){
        roll = rng.nextInt(12)+1;
        textOutput.setText("You rolled a "+roll);
    }
    private void rolltwentydie(){
        roll = rng.nextInt(20)+1;
        textOutput.setText("You rolled a "+roll);
    }



    private void goMainMenu() {
        Intent intent = new Intent(DiceRoller.this, MainMenuActivity.class);
        this.startActivity(intent);
    }

    @Override
    public void onClick(View v) {

        btnMainMenu2 = (Button) findViewById(R.id.btnMainMenu2);
    }
}