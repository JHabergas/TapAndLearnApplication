package com.example.asus.alphaapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by asus on 3/6/2017.
 */

public class SelectCategoryClass extends Dialog implements View.OnClickListener {

    private MediaPlayer buttonSound;
    private Button tapSpeakBtn, tapShowBtn, backBtn;

    private Activity mActivity;

    public SelectCategoryClass(Activity activity) {
        super(activity);
        mActivity = activity;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_select_category);

        buttonSound = MediaPlayer.create(mActivity, R.raw.button_click);

        tapSpeakBtn = (Button) findViewById(R.id.tapspeakBtn);
        Typeface tapspkTF = Typeface.createFromAsset(getContext().getAssets(), "fonts/Soft_Marshmallow.otf");
        tapSpeakBtn.setText(R.string.tapspeak);
        tapSpeakBtn.setTypeface(tapspkTF);
        tapSpeakBtn.setOnClickListener(this);

        tapShowBtn = (Button) findViewById(R.id.tapshowBtn);
        Typeface tapshwTF = Typeface.createFromAsset(getContext().getAssets(), "fonts/Soft_Marshmallow.otf");
        tapShowBtn.setText(R.string.tapshow);
        tapShowBtn.setTypeface(tapshwTF);
        tapShowBtn.setOnClickListener(this);

        backBtn = (Button) findViewById(R.id.backBtn);
        Typeface bckTF = Typeface.createFromAsset(getContext().getAssets(), "fonts/Soft_Marshmallow.otf");
        backBtn.setText(R.string.back);
        backBtn.setTypeface(bckTF);
        backBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v == tapSpeakBtn){

            buttonSound.start();
            Intent intent = new Intent(mActivity, TapSpeakActivity.class);
            mActivity.startActivity(intent);
        }

        else if (v == tapShowBtn){

            buttonSound.start();
            Intent intent = new Intent(mActivity, TapShowActivity.class);
            mActivity.startActivity(intent);

        }

        else if (v == backBtn){
            buttonSound.start();
            dismiss();
        }

    }

}
