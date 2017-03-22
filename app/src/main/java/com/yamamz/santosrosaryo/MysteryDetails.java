package com.yamamz.santosrosaryo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class MysteryDetails extends AppCompatActivity {

    private TextView firstMystery,secondMystery,thirdMystery,fourthMystery,fiftMystery;
    private ImageView imageFirst,imageSecond,imageThird,imageFouth,imageFift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent startingIntent=getIntent();
        String mystery=startingIntent.getStringExtra("misteryo");
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(mystery);
        initilizedView();

        switch (mystery){
            case "Kalipay":
                firstMystery.setText(R.string.kalipay1);
                secondMystery.setText(R.string.kalipay2);
                thirdMystery.setText(R.string.kalipay3);
                fourthMystery.setText(R.string.kalipay4);
               fiftMystery.setText(R.string.kalipay5);

                imageFirst.setImageResource(R.drawable.anunciation1);
                imageSecond.setImageResource(R.drawable.visitation1);
                imageThird.setImageResource(R.drawable.nativity1);
                imageFouth.setImageResource(R.drawable.presentation1);
                imageFift.setImageResource(R.drawable.finding1);


            break;

            case "Kasakit":
                firstMystery.setText(R.string.kasakit1);
                secondMystery.setText(R.string.kasakit2);
                thirdMystery.setText(R.string.kasakit3);
                fourthMystery.setText(R.string.kasakit4);
                fiftMystery.setText(R.string.kasakit5);
                imageFirst.setImageResource(R.drawable.getsemany1);
                imageSecond.setImageResource(R.drawable.pillar1);
                imageThird.setImageResource(R.drawable.thorns1);
                imageFouth.setImageResource(R.drawable.cross1);
                imageFift.setImageResource(R.drawable.crusifixion1);

                break;


            case "Himaya":
                firstMystery.setText(R.string.himaya1);
                secondMystery.setText(R.string.himaya2);
                thirdMystery.setText(R.string.himaya3);
                fourthMystery.setText(R.string.himaya4);
                fiftMystery.setText(R.string.himaya5);

                imageFirst.setImageResource(R.drawable.resurection1);
                imageSecond.setImageResource(R.drawable.assuncion1);
                imageThird.setImageResource(R.drawable.holy_spirit1);
                imageFouth.setImageResource(R.drawable.assumption1);
                imageFift.setImageResource(R.drawable.coronation1);

                break;

            case "Kahayag":
                firstMystery.setText(R.string.Kahayag1);
                secondMystery.setText(R.string.Kahayag2);
                thirdMystery.setText(R.string.Kahayag3);
                fourthMystery.setText(R.string.Kahayag4);
                fiftMystery.setText(R.string.Kahayag5);
                imageFirst.setImageResource(R.drawable.baptism);
                imageSecond.setImageResource(R.drawable.cana);
                imageThird.setImageResource(R.drawable.proclamation);
                imageFouth.setImageResource(R.drawable.trasfiguration);
                imageFift.setImageResource(R.drawable.eucharist);

                break;





        }
    }

    void initilizedView(){

        firstMystery=(TextView)findViewById(R.id.first_mystery);
        secondMystery=(TextView)findViewById(R.id.second_mystery);
        thirdMystery=(TextView)findViewById(R.id.third_mystery);
        fourthMystery=(TextView)findViewById(R.id.fourth_mystery);
        fiftMystery=(TextView)findViewById(R.id.fifth_mystery);
        imageFirst=(ImageView)findViewById(R.id.image_first_mystery);
        imageSecond=(ImageView)findViewById(R.id.image_second_mystery);
        imageThird=(ImageView)findViewById(R.id.image_third_mystery);
        imageFouth=(ImageView)findViewById(R.id.image_fourth_mystery);
        imageFift=(ImageView)findViewById(R.id.image_fifth_mystery);


    }

}
