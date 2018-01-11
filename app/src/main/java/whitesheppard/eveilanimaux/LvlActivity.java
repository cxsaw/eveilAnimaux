package whitesheppard.eveilanimaux;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by saw on 11/01/18.
 */

/*
*
*1-> chien
*2-> elephant
*3-> chat
*4-> loup
*6-> poule
*7-> coq
*8-> oiseau
*9-> lion // je ne l'implémente pas, son son fait trop peur hoooooooo, j'attends surtout d'avoir plus d'animaux
*
*/

public class LvlActivity extends AppCompatActivity {

    Context     context  = LvlActivity.this;

    TextView    textView ;
    ImageButton leftBtn ;
    ImageButton centerBtn ;
    ImageButton rightBtn ;
    MediaPlayer mpCriAnimaux;
    int rand1;
    int rand2;
    int rand0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("DEBUG","bonjour");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lvl);
        leftBtn = (ImageButton) findViewById(R.id.img1);
        rand0 = roll();
        leftPos(rand0);

        while (rand1 != rand0){
            rand1 = roll();
        }
        rightPos(rand1);

        while (rand2 != rand0 && rand2 != rand1){
            rand2 = roll();
        }
        centerPos(rand0);


          /**************************
          *                         *
          * listenner               *
          *                         *
          *                         *
          *                         *
          ***************************/
        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ;}

        });

        centerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ;}

        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ;}

        });
    }

    private void centerPos(int rand0) {
                 /*
        * le dice sert à choisir quel animal est le bon
        * position = 1 ==> centre
        * position = 2 ==> droite
        * position = 0 ==> gauche
        */
        switch (rand0){
            case 1:


                centerBtn.setImageResource(R.mipmap.catdraw);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }

    private void rightPos(int rand1) {
         /*
        * le dice sert à choisir quel animal est le bon
        * position = 1 ==> centre
        * position = 2 ==> droite
        * position = 0 ==> gauche
        */
        switch (rand1){
            case 1:


                rightBtn.setImageResource(R.mipmap.catdraw);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }

    private void leftPos(int rand2) {
        /*
        * le dice sert à choisir quel animal est le bon
        * position = 1 ==> centre
        * position = 2 ==> droite
        * position = 0 ==> gauche
        */
        switch (rand2){
            case 1:


                leftBtn.setImageResource(R.mipmap.catdraw);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }

    }

    private int roll() {


        int roll = 1+(int)(Math.random() * (10-1));
        Log.i("DEBUG",">>>>"+roll);
        return roll ;
    }

}
