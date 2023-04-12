package com.example.beholdersalmanac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExistingCharactersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_characters);

        Intent intent = getIntent();
        String characterName = intent.getStringExtra("character name");
        String classname = intent.getStringExtra("class name");
        String race = intent.getStringExtra("race");
        String level = intent.getStringExtra("level");
        String str = intent.getStringExtra("str");
        String dex = intent.getStringExtra("dex");
        String con = intent.getStringExtra("con");
        String intelligence = intent.getStringExtra("int");
        String wis = intent.getStringExtra("wis");
        String cha = intent.getStringExtra("cha");

        TextView txtCharacterName = (TextView) findViewById(R.id.txtCharacterName);
        TextView txtLevel = (TextView) findViewById(R.id.txtLevel);
        TextView txtClass = (TextView) findViewById(R.id.txtClass);
        TextView txtRace = (TextView) findViewById(R.id.txtRace);
        TextView txtStrStat = (TextView) findViewById(R.id.txtStrStat);
        TextView txtDexStat = (TextView) findViewById(R.id.txtDexStat);
        TextView txtConStat = (TextView) findViewById(R.id.txtConStat);
        TextView txtIntStat = (TextView) findViewById(R.id.txtIntStat);
        TextView txtWisStat = (TextView) findViewById(R.id.txtWisStat);
        TextView txtChaStat = (TextView) findViewById(R.id.txtChaStat);
        TextView txtStrBuff = (TextView) findViewById(R.id.txtStrBuff);
        TextView txtDexBuff = (TextView) findViewById(R.id.txtDexBuff);
        TextView txtConBuff = (TextView) findViewById(R.id.txtConBuff);
        TextView txtIntBuff = (TextView) findViewById(R.id.txtIntBuff);
        TextView txtWisBuff = (TextView) findViewById(R.id.txtWisBuff);
        TextView txtChaBuff = (TextView) findViewById(R.id.txtChaBuff);
        Button btnBack = (Button) findViewById(R.id.btnBack);

        txtCharacterName.setText(characterName);
        txtRace.setText(race);
        txtLevel.setText(level);
        txtClass.setText(classname);
        txtStrStat.setText(str);
        txtDexStat.setText(dex);
        txtConStat.setText(con);
        txtIntStat.setText(intelligence);
        txtWisStat.setText(wis);
        txtChaStat.setText(cha);

        int strNum = Integer.parseInt(str.replaceAll("[\\D]", ""));

        if (strNum < 10) {
            txtStrBuff.setText("-1");
        }else if (strNum >= 10 && strNum <12){
            txtStrBuff.setText("0");
        }else if (strNum >=12 && strNum <14){
            txtStrBuff.setText("1");
        }else if (strNum >=14 && strNum <16){
            txtStrBuff.setText("2");
        }else if (strNum >=16 && strNum <18){
            txtStrBuff.setText("3");
        }else{
            txtStrBuff.setText("4");
        }

        int dexNum = Integer.parseInt(dex.replaceAll("[\\D]", ""));

        if (dexNum < 10) {
            txtDexBuff.setText("-1");
        }else if (dexNum >= 10 && dexNum <12){
            txtDexBuff.setText("0");
        }else if (dexNum >=12 && dexNum <14){
            txtDexBuff.setText("1");
        }else if (dexNum >=14 && dexNum <16){
            txtDexBuff.setText("2");
        }else if (dexNum >=16 && dexNum <18){
            txtDexBuff.setText("3");
        }else{
            txtDexBuff.setText("4");
        }

        int conNum = Integer.parseInt(con.replaceAll("[\\D]", ""));

        if (conNum < 10) {
            txtConBuff.setText("-1");
        }else if (conNum >= 10 && conNum <12){
            txtConBuff.setText("0");
        }else if (conNum >=12 && conNum <14){
            txtConBuff.setText("1");
        }else if (conNum >=14 && conNum <16){
            txtConBuff.setText("2");
        }else if (conNum >=16 && conNum <18){
            txtConBuff.setText("3");
        }else{
            txtConBuff.setText("4");
        }

        int intNum = Integer.parseInt(intelligence.replaceAll("[\\D]", ""));

        if (intNum < 10) {
            txtIntBuff.setText("-1");
        }else if (intNum >= 10 && intNum <12){
            txtIntBuff.setText("0");
        }else if (intNum >=12 && intNum <14){
            txtIntBuff.setText("1");
        }else if (intNum >=14 && intNum <16){
            txtIntBuff.setText("2");
        }else if (intNum >=16 && intNum <18){
            txtIntBuff.setText("3");
        }else{
            txtIntBuff.setText("4");
        }

        int wisNum = Integer.parseInt(wis.replaceAll("[\\D]", ""));
        if (wisNum < 10) {
            txtWisBuff.setText("-1");
        }else if (wisNum >= 10 && wisNum <12){
            txtWisBuff.setText("0");
        }else if (wisNum >=12 && wisNum <14){
            txtWisBuff.setText("1");
        }else if (wisNum >=14 && wisNum <16){
            txtWisBuff.setText("2");
        }else if (wisNum >=16 && wisNum <18){
            txtWisBuff.setText("3");
        }else{
            txtWisBuff.setText("4");
        }

        int chaNum = Integer.parseInt(cha.replaceAll("[\\D]", ""));

        if (chaNum < 10) {
            txtChaBuff.setText("-1");
        }else if (chaNum >= 10 && chaNum <12){
            txtChaBuff.setText("0");
        }else if (chaNum >=12 && chaNum <14){
            txtChaBuff.setText("1");
        }else if (chaNum >=14 && chaNum <16){
            txtChaBuff.setText("2");
        }else if (chaNum >=16 && chaNum <18){
            txtChaBuff.setText("3");
        }else{
            txtChaBuff.setText("4");
        }

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ goBack();}
        });
    }

    private void goBack(){
        Intent intent = new Intent(ExistingCharactersActivity.this, CharacterSheet.class);
        this.startActivity(intent);
    }
}