package com.example.rpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Tortenet extends AppCompatActivity {
KarakterErtekek karakterErtekek = new KarakterErtekek();
MainActivity mainActivity = new MainActivity();
    Button keszBtn;
    EditText textStory;
    public static String story;

    public static String getStory() {
        return story;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_tortenet);
        textStory=findViewById(R.id.textStory);
        keszBtn=findViewById(R.id.keszBtn);
        System.out.println(KarakterErtekek.getNev());
        super.onCreate(savedInstanceState);

    }

    public void atdob(View view) {
        story = textStory.getEditableText().toString();
        Intent intent = new Intent(this,Vegso.class);
        startActivity(intent);
    }
}
