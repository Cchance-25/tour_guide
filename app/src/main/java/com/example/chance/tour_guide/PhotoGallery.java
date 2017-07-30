package com.example.chance.tour_guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class PhotoGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);

        ArrayList<Object> photos = new ArrayList<>();

        photos.add(new Photo(getString(R.string.makka), R.drawable.makka));
        photos.add(new Photo(getString(R.string.mdain_daleh), R.drawable.mdain_saleh));
        photos.add(new Photo(getString(R.string.mdain_daleh), R.drawable.mdain_saleh_1));


        ListAdapter adapter = new ListAdapter(this, photos);

        GridView gv = (GridView) findViewById(R.id.grid_view);

        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://scoopempire.com/photos-remind-beautiful-saudi-arabia/"));
                startActivity(i);
            }
        });


    }
}
