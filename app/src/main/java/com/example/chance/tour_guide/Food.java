package com.example.chance.tour_guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    private String mURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ArrayList<Object> foodList = new ArrayList<>();
        mURL = "http://www.fromtourist2local.com/blog/13-traditional-saudi-arabian-dishes";

        foodList.add(new FoodObject(getString(R.string.mofatah), mURL, R.drawable.mofatah));
        foodList.add(new FoodObject(getString(R.string.areka), mURL, R.drawable.arekah));
        foodList.add(new FoodObject(getString(R.string.kabsa), mURL, R.drawable.kabsa));

        ListAdapter adapter = new ListAdapter(this, foodList);

        GridView gv = (GridView) findViewById(R.id.food_list_view);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(mURL));
                startActivity(i);
            }
        });

    }


}
