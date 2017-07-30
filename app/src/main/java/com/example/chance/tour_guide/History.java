package com.example.chance.tour_guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class History extends AppCompatActivity {

    private final String URL = "https://www.timetoast.com/timelines/saudi-arabia-top-10-most-important-events-in-the-history";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ArrayList<Object> events = new ArrayList<>();
        // Title, details, date, image: Strings, int
        events.add(new HistoricalEvents(getString(R.string.first_event_title), getString(R.string.first_event_desc), getString(R.string.first_event_date), URL, R.drawable.first_state));
        events.add(new HistoricalEvents(getString(R.string.second_event_title), getString(R.string.second_event_desc), getString(R.string.second_event_date), URL, R.drawable.kingdom));
        events.add(new HistoricalEvents(getString(R.string.third_event_title), getString(R.string.third_event_desc), getString(R.string.third_event_date), URL, R.drawable.oil));
        events.add(new HistoricalEvents(getString(R.string.fourth_event_title), getString(R.string.fourth_event_desc), getString(R.string.fourth_event_date), URL, R.drawable.flag));


        ListAdapter la = new ListAdapter(this, events);

        ListView rootView = (ListView) findViewById(R.id.histoical_events_list_view);
        rootView.setAdapter(la);
        rootView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                startActivity(i);
            }
        });


    }
}
