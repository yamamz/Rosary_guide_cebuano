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
class SecondMysteryFragment : Fragment() {


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
                first_mystery?.setText(R.string.kalipay2)
                image_first_mystery?.setImageResource(R.drawable.visitation1)
            }

            "Kasakit" -> {
                first_mystery?.setText(R.string.kasakit2)
                image_first_mystery?.setImageResource(R.drawable.pillar1)
            }

            "Himaya" -> {
                first_mystery?.setText(R.string.himaya2)
                image_first_mystery?.setImageResource(R.drawable.assuncion1)
            }

            "Kahayag" -> {
                first_mystery?.setText(R.string.Kahayag2)
                image_first_mystery?.setImageResource(R.drawable.cana)
            }
        }
    }

}// Required empty public constructor
