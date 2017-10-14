package com.yamamz.santosrosaryo.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.yamamz.santosrosaryo.MysteryDetails

import com.yamamz.santosrosaryo.R


/**
 * A simple [Fragment] subclass.
 */
class FifthMysteryFragment : Fragment() {


    var rootView: View?=null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        rootView =inflater?.inflate(R.layout.fragment_mystery, container, false)
        setUpMystery()
        return rootView

    }

    fun setUpMystery(){
        val mystery= (activity as MysteryDetails).getMystery()
        val first_mystery=rootView?.findViewById<TextView>(R.id.first_mystery)
        val image_first_mystery=rootView?.findViewById<ImageView>(R.id.image_first_mystery)

        when (mystery) {
            "Kalipay" -> {
                first_mystery?.setText(R.string.kalipay5)
                image_first_mystery?.setImageResource(R.drawable.finding1)
            }

            "Kasakit" -> {
                first_mystery?.setText(R.string.kasakit5)
                image_first_mystery?.setImageResource(R.drawable.crusifixion1)
            }

            "Himaya" -> {
                first_mystery?.setText(R.string.himaya5)
                image_first_mystery?.setImageResource(R.drawable.coronation1)
            }

            "Kahayag" -> {
                first_mystery?.setText(R.string.Kahayag5)
                image_first_mystery?.setImageResource(R.drawable.eucharist)
            }
        }
    }

}