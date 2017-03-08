package com.example.asus.alphaapp;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer buttonSound;
    SelectCategoryClass selectCategoryClass;
    Button playButton, exitButton, changeBGbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Resources res = getResources();
        final TypedArray myBackgrounds = res.obtainTypedArray(R.array.image);
        final Random random = new Random();

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Soft_Marshmallow.otf");

        final RelativeLayout background = (RelativeLayout) findViewById(R.id.activity_home);

        buttonSound = MediaPlayer.create(this, R.raw.button_click);

        playButton = (Button) findViewById(R.id.playBtn);
        playButton.setText(R.string.play);
        playButton.setTypeface(tf);
        playButton.setOnClickListener(this);

        exitButton = (Button) findViewById(R.id.exitBtn);
        exitButton.setText(R.string.exit);
        exitButton.setTypeface(tf);
        exitButton.setOnClickListener(this);

        changeBGbtn = (Button) findViewById(R.id.changeBackgroundBtn);
        changeBGbtn.setText(R.string.changeBG);
        changeBGbtn.setTypeface(tf);
        changeBGbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                //Genrate a random index in the range
                int randomInt = random.nextInt(myBackgrounds.length());

                // Generate the drawableID from the randomInt
                int drawableID = myBackgrounds.getResourceId(randomInt, -1);
                background.setBackgroundResource(drawableID);
                //myBackgrounds.recycle();
            }
        });

        selectCategoryClass = new SelectCategoryClass(HomeActivity.this);


    }

    @Override
    public void onClick(View v) {

        if (v == playButton){

            buttonSound.start();
            selectCategoryClass.show();

            /*Intent intent = new Intent(HomeActivity.this, TapShowActivity.class);
            startActivity(intent);*/
        }

        else if (v == exitButton){
            buttonSound.start();
            finish();
        }

        /*else if (v == changeBGbtn){

        }*/

    }

    @Override
    public void onBackPressed() {
        /*super.onBackPressed();*/

    }

}
