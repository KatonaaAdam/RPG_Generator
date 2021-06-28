package com.example.rpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KarakterErtekek extends AppCompatActivity {

    TextView textFaj;
    TextView textEro;
    TextView textErtelem;
    TextView textEletero;
    TextView textMagia;
    TextView textUgyesseg;
    TextView textKitartas;
    Button tovabBtn;
    EditText textName;

    public  String faj;
    public  boolean ferfi;
    MainActivity m= new MainActivity();
    Karakter karakter=new Karakter();
    public static String nev;

    public static String getNev() {
        return nev;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_karakter_ertekek);
         textFaj=findViewById(R.id.textFaj);
         textEro=findViewById(R.id.textEro9);
        textErtelem=findViewById(R.id.textErtelem);
        textEletero=findViewById(R.id.textEletero);
        textMagia=findViewById(R.id.textMagia);
        textUgyesseg=findViewById(R.id.textUgyesseg);
        textKitartas=findViewById(R.id.textKitartas);
        tovabBtn=findViewById(R.id.tovabBtn);
        textName=findViewById(R.id.textName);
        faj=MainActivity.getFaj();
        ferfi=MainActivity.isFerfi();
        karakter=MainActivity.getK();

        if (ferfi){
            if (faj.equals("Ember")){
                textEro.setText(""+karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText(""+karakter.getEletero());
                textUgyesseg.setText(""+karakter.getUgyesseg());
                textErtelem.setText(""+karakter.getErtelem());
                textMagia.setText(""+karakter.getMagia());
                textKitartas.setText(""+karakter.getKitartas());

            }else if(faj.equals("Ork")){
                textEro.setText(""+karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText(""+karakter.getEletero());
                textUgyesseg.setText(""+karakter.getUgyesseg());
                textErtelem.setText(""+karakter.getErtelem());
                textMagia.setText(""+karakter.getMagia());
                textKitartas.setText(""+karakter.getKitartas());

            }else if(faj.equals("Tünde")){
                textEro.setText(""+karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText(""+karakter.getEletero());
                textUgyesseg.setText(""+karakter.getUgyesseg());
                textErtelem.setText(""+karakter.getErtelem());
                textMagia.setText(""+karakter.getMagia());
                textKitartas.setText(""+karakter.getKitartas());

            }else if(faj.equals("Lidérc")){
                textEro.setText(""+karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText(""+karakter.getEletero());
                textUgyesseg.setText(""+karakter.getUgyesseg());
                textErtelem.setText(""+karakter.getErtelem());
                textMagia.setText(""+karakter.getMagia());
                textKitartas.setText(""+karakter.getKitartas());

            }else{
                // Toast.makeText(this,"Egyik Faj sincs átadva",Toast.LENGTH_SHORT).show();
            }




        }else {
            if (faj.equals("Ember")) {
                textEro.setText("" + karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText("" + karakter.getEletero());
                textUgyesseg.setText("" + karakter.getUgyesseg());
                textErtelem.setText("" + karakter.getErtelem());
                textMagia.setText("" + karakter.getMagia());
                textKitartas.setText("" + karakter.getKitartas());

            } else if (faj.equals("Ork")) {
                textEro.setText("" + karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText("" + karakter.getEletero());
                textUgyesseg.setText("" + karakter.getUgyesseg());
                textErtelem.setText("" + karakter.getErtelem());
                textMagia.setText("" + karakter.getMagia());
                textKitartas.setText("" + karakter.getKitartas());

            } else if (faj.equals("Tünde")) {
                textEro.setText("" + karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText("" + karakter.getEletero());
                textUgyesseg.setText("" + karakter.getUgyesseg());
                textErtelem.setText("" + karakter.getErtelem());
                textMagia.setText("" + karakter.getMagia());
                textKitartas.setText("" + karakter.getKitartas());

            } else if (faj.equals("Lidérc")) {
                textEro.setText("" + karakter.getEro());
                textFaj.setText(faj);
                textEletero.setText("" + karakter.getEletero());
                textUgyesseg.setText("" + karakter.getUgyesseg());
                textErtelem.setText("" + karakter.getErtelem());
                textMagia.setText("" + karakter.getMagia());
                textKitartas.setText("" + karakter.getKitartas());


            }
        }



        super.onCreate(savedInstanceState);

    }

    public void tovab(View view) {
        nev = textName.getEditableText().toString();
        Intent intent= new Intent(this,Tortenet.class);
        startActivity(intent);
    }
}
