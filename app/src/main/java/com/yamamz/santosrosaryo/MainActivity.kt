package com.yamamz.santosrosaryo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem

import com.yamamz.santosrosaryo.adapter.mysteryAdapter
import com.yamamz.santosrosaryo.model.Mystery
import com.yamamz.santosrosaryo.ui.DeviderItemDecoration

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private val mysteries = ArrayList<Mystery>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        setupRecyclerView()
        addMystery()
    }

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val mAdapter = mysteryAdapter(this@MainActivity, mysteries)
        val mLayoutManager = LinearLayoutManager(recyclerView.context)
        recyclerView.layoutManager = mLayoutManager
        recyclerView.addItemDecoration(DeviderItemDecoration(this@MainActivity, LinearLayoutManager.VERTICAL))
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = mAdapter
    }

    internal fun addMystery() {
        val lunes = Mystery("Lunes", "Kalipay", R.drawable.joyful)
        mysteries.add(lunes)
        val martes = Mystery("Martes", "Kasakit", R.drawable.joyful)
        mysteries.add(martes)
        val merkules = Mystery("Meyerkules", "Himaya", R.drawable.joyful)
        mysteries.add(merkules)
        val huwebes = Mystery("Huwebes", "Kahayag", R.drawable.joyful)
        mysteries.add(huwebes)
        val beirnes = Mystery("Byernes", "Kasakit", R.drawable.joyful)
        mysteries.add(beirnes)
        val sabado = Mystery("Sabado", "Kalipay", R.drawable.joyful)
        mysteries.add(sabado)
        val domingo = Mystery("Domingo", "Himaya", R.drawable.joyful)
        mysteries.add(domingo)
    }


}
