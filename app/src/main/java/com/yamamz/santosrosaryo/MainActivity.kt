package com.yamamz.santosrosaryo

import android.os.Bundle
import android.support.v7.app.AlertDialog
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
import com.yamamz.santosrosaryo.util.Util
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val mysteries = ArrayList<Mystery>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        setupRecyclerView()
        addMystery()


        fabEdit.setOnClickListener {
            val builder = AlertDialog.Builder(this, R.style.MyDialogTheme)
            val positiveText = getString(android.R.string.ok)
            builder.setTitle(getString(R.string.dialog_title))
            builder.setMessage(getString(R.string.dialog_message1))
            builder.setPositiveButton(positiveText) { _, _ ->
            }

            val dialog = builder.create()
            dialog.show()
        }

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

        //joyFull
        val ramdomJoyful=Util.joyFull_array
        //sorrowful
        val ramdomsorrowful=Util.sorrowFull_array
        //gloriuos
        val ramdomGlorious=Util.glorious_array
        //luminous
        val ramdomluminous=Util.luminous_array
        val lunes = Mystery("Lunes", "Kalipay", ramdomJoyful[Random().nextInt(ramdomJoyful.size)])
        mysteries.add(lunes)
        val martes = Mystery("Martes", "Kasakit", ramdomsorrowful[Random().nextInt(ramdomGlorious.size)])
        mysteries.add(martes)
        val merkules = Mystery("Meyerkules", "Himaya", ramdomGlorious[Random().nextInt(ramdomGlorious.size)])
        mysteries.add(merkules)
        val huwebes = Mystery("Huwebes", "Kahayag", ramdomluminous[Random().nextInt(ramdomluminous.size)])
        mysteries.add(huwebes)
        val beirnes = Mystery("Byernes", "Kasakit", ramdomsorrowful[Random().nextInt(ramdomGlorious.size)])
        mysteries.add(beirnes)
        val sabado = Mystery("Sabado", "Kalipay", ramdomJoyful[Random().nextInt(ramdomJoyful.size)])
        mysteries.add(sabado)
        val domingo = Mystery("Domingo", "Himaya", ramdomGlorious[Random().nextInt(ramdomGlorious.size)])
        mysteries.add(domingo)
    }


}
