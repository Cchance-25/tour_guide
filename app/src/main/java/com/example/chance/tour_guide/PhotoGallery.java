package com.example.chance.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhotoGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);

        ArrayList<Object> t = new ArrayList<>();
        t.add(new tmpClass("Text1", "Text2", "Text3"));
        t.add(new tmpClass("Text4", "Text5", "Text6"));
        t.add(new tmpClass("Text7", "Text8", "Text9"));
        t.add(new tmpClass("Text10", "Text11", "Text12"));

        ListView rootView = (ListView) findViewById(R.id.tmp_view);
        ListAdapter la = new ListAdapter(this, t);
        rootView.setAdapter(la);




    }
}
