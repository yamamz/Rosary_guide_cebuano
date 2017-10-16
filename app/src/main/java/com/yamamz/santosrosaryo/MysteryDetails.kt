package com.yamamz.santosrosaryo

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.yamamz.santosrosaryo.fragments.*
import kotlinx.android.synthetic.main.activity_mystery_details.*
import java.util.ArrayList

class MysteryDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mystery_details)
        setSupportActionBar(toolbar)
        //val startingIntent = intent
       // val mystery = startingIntent.getStringExtra("misteryo")
        collapsing_toolbar.title = " "


        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        if (viewPager != null) {
            setupViewPager(viewPager)
        }

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)

    }

    fun getMystery():String{
        val startingIntent = intent
        val mystery = startingIntent.getStringExtra("misteryo")
        return mystery
    }

    private fun setupViewPager(viewPager: ViewPager) {

        val adapter = Adapter(supportFragmentManager)
        adapter.addFragment(IntroFragment(), "Sinugdanan")
        adapter.addFragment(FirstMysteryFragment(), "1 Misteryo")
        adapter.addFragment(SecondMysteryFragment(), "2 Misteryo")
        adapter.addFragment(ThirdMysteryFragment(), "3 Misteryo")
        adapter.addFragment(ForthMysteryFragment(), "4 Misteryo")
        adapter.addFragment(FifthMysteryFragment(), "5 Misteryo")
        adapter.addFragment(LastFragment(), "Maghimaya Ka Rayna ug Litanya")
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
