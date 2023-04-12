package com.example.beholdersalmanac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class NewCharacterActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSave;
    Button btnBack2;
    Spinner spnRace;
    Spinner spnLevel;
    Spinner spnClass;
    EditText txtInputCharacterName;
    EditText txtInputStr;
    EditText txtInputDex;
    EditText txtInputCon;
    EditText txtInputInt;
    EditText txtInputWis;
    EditText txtInputCha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_character);

        spnLevel = (Spinner) findViewById(R.id.spnLevel);
        spnRace = (Spinner) findViewById(R.id.spnRace);
        spnClass = (Spinner) findViewById(R.id.spnClass);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnBack2 = (Button) findViewById(R.id.btnBack2);
        txtInputCharacterName = (EditText) findViewById(R.id.txtInputCharacterName);
        txtInputStr = (EditText) findViewById(R.id.txtInputStr);
        txtInputDex = (EditText) findViewById(R.id.txtInputDex);
        txtInputCon = (EditText) findViewById(R.id.txtInputCon);
        txtInputInt = (EditText) findViewById(R.id.txtInputInt);
        txtInputWis = (EditText) findViewById(R.id.txtInputWis);
        txtInputCha = (EditText) findViewById(R.id.txtInputCha);

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });


        btnSave.setOnClickListener(this);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });



    }

    @Override
    public void onClick(View v) {
        String characterName, race, level, classname, str, dex, con, intelligence, wis, cha;


        race = spnRace.getSelectedItem().toString();
        level = spnLevel.getSelectedItem().toString();
        classname = spnClass.getSelectedItem().toString();
        characterName = txtInputCharacterName.getText().toString();
        str = txtInputStr.getText().toString();
        dex = txtInputDex.getText().toString();
        con = txtInputCon.getText().toString();
        intelligence = txtInputInt.getText().toString();
        wis = txtInputWis.getText().toString();
        cha = txtInputCha.getText().toString();

        Intent intent = new Intent(NewCharacterActivity.this, ExistingCharactersActivity.class);
        intent.putExtra("race", race);
        intent.putExtra("level", level);
        intent.putExtra("class name", classname);
        intent.putExtra("character name", characterName);
        intent.putExtra("str", str);
        intent.putExtra("dex", dex);
        intent.putExtra("con", con);
        intent.putExtra("int", intelligence);
        intent.putExtra("wis", wis);
        intent.putExtra("cha", cha);
    }

    private void displayToast(){
        Toast.makeText(this, "Information Saved!", Toast.LENGTH_LONG).show();
    }

    private void goBack(){
        Intent intent = new Intent(NewCharacterActivity.this, CharacterSheet.class);
        this.startActivity(intent);
    }
}