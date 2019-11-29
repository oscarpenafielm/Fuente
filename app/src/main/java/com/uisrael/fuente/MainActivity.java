package com.uisrael.fuente;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView texto1;
    private TextView texto2;
    private TextView texto3;
    private TextView texto4;
    private TextView texto5;
    private TextView texto6;


    private Typeface AnandaB;
    private Typeface Enchanting;
    private Typeface Anandap;
    private Typeface Gabrielle;
    private Typeface Laughing;
    private Typeface QuinchoScript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String fuente1="fuentes/AnandaB.ttf";
        this.AnandaB=Typeface.createFromAsset(getAssets(),fuente1);


        String fuente2="fuentes/Enchanting.ttf";
        this.Enchanting=Typeface.createFromAsset(getAssets(),fuente2);


        String fuente3="fuentes/AnandaP.ttf";
        this.Anandap=Typeface.createFromAsset(getAssets(),fuente3);



        String fuente4="fuentes/Gabrielle.ttf";
        this.Gabrielle=Typeface.createFromAsset(getAssets(),fuente4);


        String fuente5="fuentes/Laughing.ttf";
        this.Laughing=Typeface.createFromAsset(getAssets(),fuente5);


        String fuente6="fuentes/QuinchoScript.ttf";
        this.QuinchoScript=Typeface.createFromAsset(getAssets(),fuente6);

        texto1=(TextView)findViewById(R.id.txtuno);
        texto1.setTypeface(AnandaB);
        texto2=(TextView)findViewById(R.id.txtdos);
        texto2.setTypeface(Enchanting);
        texto3=(TextView)findViewById(R.id.txttres);
        texto3.setTypeface(Anandap);

        texto4=(TextView)findViewById(R.id.txtcuatro);
        texto4.setTypeface(Gabrielle);
        texto5=(TextView)findViewById(R.id.txtcinco);
        texto5.setTypeface(Laughing);
        texto6=(TextView)findViewById(R.id.txtseis);
        texto6.setTypeface(QuinchoScript);
    }
}
