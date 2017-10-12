package com.yamamz.santosrosaryo

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.yamamz.santosrosaryo.fragments.MysteryFragment
import kotlinx.android.synthetic.main.activity_mystery_details.*
import kotlinx.android.synthetic.main.content_mystery_details.*
import java.util.ArrayList

class MysteryDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mystery_details)
        setSupportActionBar(toolbar)
        val startingIntent = intent
        val mystery = startingIntent.getStringExtra("misteryo")
        collapsing_toolbar.title = mystery


        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        if (viewPager != null) {
            setupViewPager(viewPager)
        }

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)


//        when (mystery) {
//            "Kalipay" -> {
//                first_mystery.setText(R.string.kalipay1)
//                second_mystery.setText(R.string.kalipay2)
//                third_mystery.setText(R.string.kalipay3)
//                fourth_mystery.setText(R.string.kalipay4)
//                fifth_mystery.setText(R.string.kalipay5)
//
//                image_first_mystery.setImageResource(R.drawable.anunciation1)
//                image_second_mystery.setImageResource(R.drawable.visitation1)
//                image_third_mystery.setImageResource(R.drawable.nativity1)
//                image_fourth_mystery.setImageResource(R.drawable.presentation1)
//                image_fifth_mystery.setImageResource(R.drawable.finding1)
//            }
//
//            "Kasakit" -> {
//                first_mystery.setText(R.string.kasakit1)
//                second_mystery.setText(R.string.kasakit2)
//                third_mystery.setText(R.string.kasakit3)
//                fourth_mystery.setText(R.string.kasakit4)
//                fifth_mystery.setText(R.string.kasakit5)
//                image_first_mystery.setImageResource(R.drawable.getsemany1)
//                image_second_mystery.setImageResource(R.drawable.pillar1)
//                image_third_mystery.setImageResource(R.drawable.thorns1)
//                image_fourth_mystery.setImageResource(R.drawable.cross1)
//                image_fifth_mystery.setImageResource(R.drawable.crusifixion1)
//            }
//
//            "Himaya" -> {
//                first_mystery.setText(R.string.himaya1)
//                second_mystery.setText(R.string.himaya2)
//                third_mystery.setText(R.string.himaya3)
//                fourth_mystery.setText(R.string.himaya4)
//                fifth_mystery.setText(R.string.himaya5)
//
//                image_first_mystery.setImageResource(R.drawable.resurection1)
//                image_second_mystery.setImageResource(R.drawable.assuncion1)
//                image_third_mystery.setImageResource(R.drawable.holy_spirit1)
//                image_fourth_mystery.setImageResource(R.drawable.assumption1)
//                image_fifth_mystery.setImageResource(R.drawable.coronation1)
//            }
//
//            "Kahayag" -> {
//                first_mystery.setText(R.string.Kahayag1)
//                second_mystery.setText(R.string.Kahayag2)
//                third_mystery.setText(R.string.Kahayag3)
//                fourth_mystery.setText(R.string.Kahayag4)
//                fifth_mystery.setText(R.string.Kahayag5)
//                image_first_mystery.setImageResource(R.drawable.baptism)
//                image_second_mystery.setImageResource(R.drawable.cana)
//                image_third_mystery.setImageResource(R.drawable.proclamation)
//                image_fourth_mystery.setImageResource(R.drawable.trasfiguration)
//                image_fifth_mystery.setImageResource(R.drawable.eucharist)
//            }
//        }
    }

    private fun setupViewPager(viewPager: ViewPager) {

        val adapter = Adapter(supportFragmentManager)
        adapter.addFragment(MysteryFragment(), "Sinugdanan")
        adapter.addFragment(MysteryFragment(), "1 Misteryo")
        adapter.addFragment(MysteryFragment(), "2 Misteryo")
        adapter.addFragment(MysteryFragment(), "3 Misteryo")
        adapter.addFragment(MysteryFragment(), "4 Misteryo")
        adapter.addFragment(MysteryFragment(), "5 Misteryo")
        viewPager.adapter = adapter

    }


    private class Adapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        private val mFragments = ArrayList<Fragment>()
        private val mFragmentTitles = ArrayList<String>()

        internal fun addFragment(fragment: Fragment, title: String) {
            mFragments.add(fragment)
            mFragmentTitles.add(title)
        }

        override fun getItem(position: Int): Fragment {
            return mFragments[position]
        }

        override fun getCount(): Int {
            return mFragments.size
        }

        override fun getPageTitle(position: Int): CharSequence {
            return mFragmentTitles[position]
        }
    }

}
