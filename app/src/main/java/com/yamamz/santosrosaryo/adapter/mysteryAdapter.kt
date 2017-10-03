package com.yamamz.santosrosaryo.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.yamamz.santosrosaryo.MysteryDetails
import com.yamamz.santosrosaryo.R
import com.yamamz.santosrosaryo.model.Mystery

/**
 * Created by AMRI on 1/22/2017.
 */

class mysteryAdapter(private val context: Context, private val mysteryList: List<Mystery>) : RecyclerView.Adapter<mysteryAdapter.myViewHolder>() {

    private val mBackground: Int


    inner class myViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val day: TextView = mView.findViewById<View>(R.id.day) as TextView
        val mystery: TextView = mView.findViewById<View>(R.id.mystery) as TextView
        val icon: ImageView = mView.findViewById<View>(R.id.imageView) as ImageView


    }

    init {
        val mTypedValue = TypedValue()
        context.theme.resolveAttribute(R.attr.selectableItemBackgroundBorderless, mTypedValue, true)
        mBackground = mTypedValue.resourceId
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.mystery_list, parent, false)
        itemView.setBackgroundResource(mBackground)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val mystery = mysteryList[position]
        holder.day.text = mystery.day

        holder.mystery.text = mystery.mystery
        holder.icon.setImageResource(mystery.image!!)
        holder.mView.setOnClickListener {
            val intent = Intent(context, MysteryDetails::class.java)
            intent.putExtra("misteryo", mystery.mystery)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return mysteryList.size
    }


}
