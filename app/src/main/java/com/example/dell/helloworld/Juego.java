package com.example.dell.helloworld;

import android.app.Activity;
<<<<<<< HEAD
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
=======
import android.content.Intent;
>>>>>>> 8d7759f26a03942aeb2a8b63ecfb6d457573783c
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
<<<<<<< HEAD
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

=======
import android.widget.Toast;

>>>>>>> 8d7759f26a03942aeb2a8b63ecfb6d457573783c
/**
 * Created by Dell on 29/01/2015.
 */
public class Juego extends ActionBarActivity implements View.OnClickListener {

<<<<<<< HEAD
    MediaPlayer md;

    int fotos_cir[] = {R.drawable.icon_flor, R.drawable.icon_pelota,
            R.drawable.icon_rueda, R.drawable.icon_sol};

    int fotos_cua[] = {R.drawable.icon_casa, R.drawable.icon_tele,
            R.drawable.icon_ventana, R.drawable.icon_regalo};

    int fotos_tri[] = {R.drawable.icon_arbol, R.drawable.icon_piramide,
            R.drawable.icon_monte, R.drawable.icon_barco};

    int fig_seleccionada;
    static int puntaje = 0;

=======
>>>>>>> 8d7759f26a03942aeb2a8b63ecfb6d457573783c
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
<<<<<<< HEAD

=======
>>>>>>> 8d7759f26a03942aeb2a8b63ecfb6d457573783c
        ImageView img = (ImageView) findViewById(R.id.foto1);
        ImageView img2 = (ImageView) findViewById(R.id.foto5);
        ImageView img3 = (ImageView) findViewById(R.id.foto3);
        ImageView img4 = (ImageView) findViewById(R.id.foto4);
<<<<<<< HEAD
        TextView titulo = (TextView) findViewById(R.id.textoBusqueda);

        TextView textPuntaje = (TextView) findViewById(R.id.textPuntaje);
        textPuntaje.setText("Puntaje:"+puntaje+"\nPuntuación máxima = 25");

        int solutionArray[] = {0,1,2,3};
        shuffleArray(solutionArray);
        ImageView imagenes[] = {img, img2, img3, img4};

=======
>>>>>>> 8d7759f26a03942aeb2a8b63ecfb6d457573783c

        img.setOnClickListener(Juego.this);
        img2.setOnClickListener(Juego.this);
        img3.setOnClickListener(Juego.this);
        img4.setOnClickListener(Juego.this);
<<<<<<< HEAD

        Random rand = new Random();
        fig_seleccionada = imagenes[solutionArray[0]].getId();
        int opcion = rand.nextInt(3);

        switch (opcion){
            case 0:
                titulo.setText("Busca el círculo :D");
                imagenes[solutionArray[0]].setImageResource(fotos_cir[rand.nextInt(4)]);
                imagenes[solutionArray[1]].setImageResource(fotos_cua[rand.nextInt(4)]);
                imagenes[solutionArray[2]].setImageResource(rand.nextInt()%2==0?
                        fotos_tri[rand.nextInt(4)]:fotos_cua[rand.nextInt(4)]);
                imagenes[solutionArray[3]].setImageResource(fotos_tri[rand.nextInt(4)]);
                break;
            case 1:
                titulo.setText("Busca el cuadrado :D");
                imagenes[solutionArray[0]].setImageResource(fotos_cua[rand.nextInt(4)]);
                imagenes[solutionArray[1]].setImageResource(fotos_cir[rand.nextInt(4)]);
                imagenes[solutionArray[2]].setImageResource(rand.nextInt()%2==0?
                        fotos_tri[rand.nextInt(4)]:fotos_cir[rand.nextInt(4)]);
                imagenes[solutionArray[3]].setImageResource(fotos_tri[rand.nextInt(4)]);
                break;
            case 2:
                titulo.setText("Busca el triángulo :D");
                imagenes[solutionArray[0]].setImageResource(fotos_tri[rand.nextInt(4)]);
                imagenes[solutionArray[1]].setImageResource(fotos_cua[rand.nextInt(4)]);
                imagenes[solutionArray[2]].setImageResource(rand.nextInt()%2==0?
                        fotos_cua[rand.nextInt(4)]:fotos_cir[rand.nextInt(4)]);
                imagenes[solutionArray[3]].setImageResource(fotos_cir[rand.nextInt(4)]);
                break;
        }
    }

    static void shuffleArray(int[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public void onClick(View v) {
        int imag_contenida = 0;
        switch (v.getId()) {
            case R.id.foto1:
                imag_contenida = this.getResources().getIdentifier("foto1", "id", this.getPackageName());
                break;
            case R.id.foto5:
                imag_contenida = this.getResources().getIdentifier("foto5", "id", this.getPackageName());
                break;
            case R.id.foto3:
                imag_contenida = this.getResources().getIdentifier("foto3", "id", this.getPackageName());
                break;
            case R.id.foto4:
                imag_contenida = this.getResources().getIdentifier("foto4", "id", this.getPackageName());
                break;
        }
        TextView textPuntaje = (TextView) findViewById(R.id.textPuntaje);
        if(imag_contenida == fig_seleccionada){
            puntaje++;
            md = MediaPlayer.create(getApplicationContext(),R.raw.correct);
            md.start();
        }
        else{
            if(puntaje > 0){
                puntaje--;
            }
            md = MediaPlayer.create(getApplicationContext(),R.raw.error);
            md.start();
        }
        if (puntaje == 25){
            Toast toast = Toast.makeText(Juego.this, "¡Felicitaciones!\n" +
                    "Llegaste a puntación máxima :D", Toast.LENGTH_LONG);
            toast.show();
            puntaje = 0;
            finish();
        }else{
            finish();
            startActivity(getIntent());
        }
=======
    }

    public void onClick(View v) {
        Toast toast;
        switch (v.getId()) {
            case R.id.foto1:
                toast = Toast.makeText(Juego.this, "Correcto", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.foto5:
                toast = Toast.makeText(Juego.this, "Incorrecto", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.foto3:
                toast = Toast.makeText(Juego.this, "Incorrecto", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.foto4:
                toast = Toast.makeText(Juego.this, "Incorrecto", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
>>>>>>> 8d7759f26a03942aeb2a8b63ecfb6d457573783c
    }
}
