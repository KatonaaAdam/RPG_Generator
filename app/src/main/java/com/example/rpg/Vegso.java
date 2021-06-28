package com.example.rpg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Vegso extends AppCompatActivity {
    private static final String FILE_Name="karakter.json";

    MainActivity mainActivity = new MainActivity();
    KarakterErtekek karakterErtekek = new KarakterErtekek();
    Tortenet tortenet = new Tortenet();
    TextView textFaj;
    TextView textEro;
    TextView textErtelem;
    TextView textEletero;
    TextView textMagia;
    TextView textUgyesseg;
    TextView textKitartas;
    TextView textNev;
    TextView story;

    Button tovabBtn;
    String faj,nev,tort;
    Karakter karakter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegso);
        textFaj=findViewById(R.id.fajText);
        textNev=findViewById(R.id.nevText);
        textEro=findViewById(R.id.eroErtek);
        textErtelem=findViewById(R.id.ertelemErtek);
        textEletero=findViewById(R.id.eleteroErtek);
        textMagia=findViewById(R.id.magiaErtek);
        textUgyesseg=findViewById(R.id.ugyessegErtek);
        textKitartas=findViewById(R.id.kitartasErtek);
        tovabBtn=findViewById(R.id.button);
        story = findViewById(R.id.storyErtek);



        faj=MainActivity.getFaj();
        nev = KarakterErtekek.getNev();
        tort = Tortenet.getStory();
        karakter=MainActivity.getK();

        textNev.setText(""+nev);
        textFaj.setText(""+faj);
        textEro.setText(""+karakter.getEro());
        textEletero.setText(""+karakter.getEletero());
        textUgyesseg.setText(""+karakter.getUgyesseg());
        textErtelem.setText(""+karakter.getErtelem());
        textMagia.setText(""+karakter.getMagia());
        textKitartas.setText(""+karakter.getKitartas());
        story.setText(""+tort);



    }
//{name: "John", age: 31, city: "New York"};
    public void export(View view) {
        String text="{ \"Név\": \""+textNev.getText().toString()+"\", \"Faj\": \""+textFaj.getText().toString()+"\", \"Erő\": \""+textEro.getText().toString()+"\", \"Életerő\": \""+textEletero.getText().toString()+"\",\" Ügyesség\": \""+textUgyesseg.getText().toString()+"\", \"Értelem\": \""+textErtelem.getText().toString()+"\", \"Mágia\": \""+textMagia.getText().toString()+"\", \"Kitartás\": \""+textKitartas.getText().toString()+"\", \"Történet\": \""+tort+"\"}";
        FileOutputStream fos=null;
        try{
            fos=openFileOutput(FILE_Name,MODE_PRIVATE);
            fos.write(text.getBytes());
            System.out.println("--------------------------------------------------"+text);

            Toast.makeText(this,"Mentés sikeres"+getFilesDir()+"/"+FILE_Name,Toast.LENGTH_LONG).show();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
