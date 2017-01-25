package com.hackingbuzz.animation4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView angryBird;
    ImageView whiteBackground;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        angryBird = (ImageView) findViewById(R.id.imageView);

        angryBird.setOnClickListener(this);

        whiteBackground = (ImageView) findViewById(R.id.imageView2);   //we need an image to make onCLick work or button or somthing
                                                                        // not empty screen
        whiteBackground.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        whiteBackground.animate().alpha(0f).setDuration(2000);


      /*  angryBird.setTranslationX(-1000);      // make the image that is off the screen to come on the screen ( - ) for left direction
        angryBird.animate().translationXBy(1000).setDuration(2000);*/




        angryBird.setTranslationX(-1000f);   // image will come diganolly between X and Y axis
        angryBird.setTranslationY(-1000);

        angryBird.animate().translationXBy(1000).translationYBy(1000f).setDuration(2000);
        //if image is coming diganolly we gotta give way by describing X and Y translation both (it just give it the dignol way to it for coming

    }
}
