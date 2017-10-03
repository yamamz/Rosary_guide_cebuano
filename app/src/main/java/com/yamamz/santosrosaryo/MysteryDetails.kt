package com.yamamz.santosrosaryo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mystery_details.*
import kotlinx.android.synthetic.main.content_mystery_details.*

class MysteryDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mystery_details)
        setSupportActionBar(toolbar)
        val startingIntent = intent
        val mystery = startingIntent.getStringExtra("misteryo")
        collapsing_toolbar.title = mystery

        when (mystery) {
            "Kalipay" -> {
                first_mystery.setText(R.string.kalipay1)
                second_mystery.setText(R.string.kalipay2)
                third_mystery.setText(R.string.kalipay3)
                fourth_mystery.setText(R.string.kalipay4)
                fifth_mystery.setText(R.string.kalipay5)

                image_first_mystery.setImageResource(R.drawable.anunciation1)
                image_second_mystery.setImageResource(R.drawable.visitation1)
                image_third_mystery.setImageResource(R.drawable.nativity1)
                image_fourth_mystery.setImageResource(R.drawable.presentation1)
                image_fifth_mystery.setImageResource(R.drawable.finding1)
            }

            "Kasakit" -> {
                first_mystery.setText(R.string.kasakit1)
                second_mystery.setText(R.string.kasakit2)
                third_mystery.setText(R.string.kasakit3)
                fourth_mystery.setText(R.string.kasakit4)
                fifth_mystery.setText(R.string.kasakit5)
                image_first_mystery.setImageResource(R.drawable.getsemany1)
                image_second_mystery.setImageResource(R.drawable.pillar1)
                image_third_mystery.setImageResource(R.drawable.thorns1)
                image_fourth_mystery.setImageResource(R.drawable.cross1)
                image_fifth_mystery.setImageResource(R.drawable.crusifixion1)
            }

            "Himaya" -> {
                first_mystery.setText(R.string.himaya1)
                second_mystery.setText(R.string.himaya2)
                third_mystery.setText(R.string.himaya3)
                fourth_mystery.setText(R.string.himaya4)
                fifth_mystery.setText(R.string.himaya5)

                image_first_mystery.setImageResource(R.drawable.resurection1)
                image_second_mystery.setImageResource(R.drawable.assuncion1)
                image_third_mystery.setImageResource(R.drawable.holy_spirit1)
                image_fourth_mystery.setImageResource(R.drawable.assumption1)
                image_fifth_mystery.setImageResource(R.drawable.coronation1)
            }

            "Kahayag" -> {
                first_mystery.setText(R.string.Kahayag1)
                second_mystery.setText(R.string.Kahayag2)
                third_mystery.setText(R.string.Kahayag3)
                fourth_mystery.setText(R.string.Kahayag4)
                fifth_mystery.setText(R.string.Kahayag5)
                image_first_mystery.setImageResource(R.drawable.baptism)
                image_second_mystery.setImageResource(R.drawable.cana)
                image_third_mystery.setImageResource(R.drawable.proclamation)
                image_fourth_mystery.setImageResource(R.drawable.trasfiguration)
                image_fifth_mystery.setImageResource(R.drawable.eucharist)
            }
        }
    }


}
