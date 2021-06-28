package com.example.rpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    public static Karakter k=new Karakter();
    RadioGroup nemGroup;
    RadioGroup fajGroup;
    Button general;


    public static String faj;
    public static boolean ferfi;

    public static String getFaj() {
        return faj;
    }

    public static boolean isFerfi() {
        return ferfi;
    }

    public static Karakter getK() {
        return k;
    }
//MainActivity(){}



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {



        nemGroup=findViewById(R.id.nemGroup);
        fajGroup=findViewById(R.id.fajGroup);
        general=findViewById(R.id.generalBtn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void general(View view) {



        if (faj==null){
            Toast.makeText(this, "Nincs kiválasztva a Faj!", Toast.LENGTH_SHORT).show();
            System.out.println("nincs faj");
        }else {

        System.out.println("fajok");
        if(ferfi){
         if (faj.equals("Ember")){
             k.embertGeneral();
             System.out.println(k.getEro());
         }  else if (faj.equals("Ork")){
             k.orkotGeneral();
         }else if (faj.equals("Tünde")){
             k.tundetGeneral();
         }else if (faj.equals("Lidérc")){
             k.lidercetGeneral();
         }
        }else if(!ferfi){
            if (faj.equals("Ember")){
                k.embertGeneralNo();
                System.out.println(k.getEro());
            }  else if (faj.equals("Ork")){
                k.orkotGeneralNo();
            }else if (faj.equals("Tünde")){
                k.tundetGeneralNo();
            }else if (faj.equals("Lidérc")){
                k.lidercetGeneralNo();
            }
        }else{
            Toast.makeText(this, "Nincs kiválasztva a Nem!", Toast.LENGTH_SHORT).show();
        }

        Intent intent= new Intent(this,KarakterErtekek.class);
        startActivity(intent);}
    }



    public void checkBtn(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.noRbtn:
                if (checked)
                    Toast.makeText(this,"Nő karakter",Toast.LENGTH_SHORT).show();
                ferfi=false;

                break;
            case R.id.ferfiRbtn:
                if (checked)
                    Toast.makeText(this,"Férfi karakter",Toast.LENGTH_SHORT).show();
                ferfi=true;
                break;
        }

    }

    public void checkBtn1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.emberRbtn:
                if (checked)
                    Toast.makeText(this,"Ember karakter",Toast.LENGTH_SHORT).show();
                faj="Ember";

                break;
            case R.id.orkRbtn:
                if (checked)
                    Toast.makeText(this,"Ork karakter",Toast.LENGTH_SHORT).show();
                faj="Ork";
                break;
            case R.id.tundeRbtn:
                if (checked)
                    Toast.makeText(this,"Tünde karakter",Toast.LENGTH_SHORT).show();
                faj="Tünde";
                break;
            case R.id.lidercRbtn:
                if (checked)
                    Toast.makeText(this,"Lidérc karakter",Toast.LENGTH_SHORT).show();
                faj="Lidérc";
                break;
        }
}


}
