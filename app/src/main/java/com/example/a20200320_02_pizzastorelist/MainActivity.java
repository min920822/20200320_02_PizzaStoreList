package com.example.a20200320_02_pizzastorelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.a20200320_02_pizzastorelist.databinding.ActivityMainBinding;
import com.example.a20200320_02_pizzastorelist.datas.PizzaStore;
import com.example.a20200320_02_pizzastorelist.datas.adapters.PizzastoreAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity  {

    List<PizzaStore> pizzaStores = new ArrayList<>();
    PizzastoreAdapter psa = null;

    ActivityMainBinding binding = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }


    @Override
    public void setEvents() {

    }

    @Override
    public void setValues() {
        psa = new PizzastoreAdapter(mContext,R.layout.pizza_store_list_item,pizzaStores);
        binding.pizzaListView.setAdapter(psa);

    }
}
