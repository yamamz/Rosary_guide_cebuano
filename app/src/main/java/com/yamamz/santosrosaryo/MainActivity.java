package com.yamamz.santosrosaryo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.yamamz.santosrosaryo.adapter.mysteryAdapter;
import com.yamamz.santosrosaryo.model.Mystery;
import com.yamamz.santosrosaryo.ui.DeviderItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Mystery> mysteries=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupRecyclerView();
        addMystery();
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mysteryAdapter mAdapter = new mysteryAdapter(MainActivity.this, mysteries);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DeviderItemDecoration(MainActivity.this,LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

    void addMystery(){
        Mystery lunes=new Mystery("Lunes","Kalipay",R.drawable.joyful);
        mysteries.add(lunes);
        Mystery martes=new Mystery("Martes","Kasakit",R.drawable.joyful);
        mysteries.add(martes);
        Mystery merkules=new Mystery("Meyerkules","Himaya",R.drawable.joyful);
        mysteries.add(merkules);
        Mystery huwebes=new Mystery("Huwebes","Kahayag",R.drawable.joyful);
        mysteries.add(huwebes);
        Mystery beirnes=new Mystery("Byernes","Kasakit",R.drawable.joyful);
        mysteries.add(beirnes);
        Mystery sabado=new Mystery("Sabado","Kalipay",R.drawable.joyful);
        mysteries.add(sabado);
        Mystery domingo=new Mystery("Domingo","Himaya",R.drawable.joyful);
        mysteries.add(domingo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
