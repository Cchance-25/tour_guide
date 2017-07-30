package com.example.chance.tour_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by chance on 7/28/17.
 */


public class ListAdapter extends ArrayAdapter<Object> {



    public ListAdapter(Context context, ArrayList<Object> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View lv = convertView;

        if (getItem(position) instanceof HistoricalEvents) {

            if (lv == null) {
                lv = LayoutInflater.from(getContext()).inflate(R.layout.list_item_simple_list, parent, false);
            }

            HistoricalEvents currentEvent = (HistoricalEvents) getItem(position);

            TextView eventTitle = (TextView) lv.findViewById(R.id.event_title);
            eventTitle.setText(currentEvent.getmEventTitle());


            TextView eventDescription = (TextView) lv.findViewById(R.id.event_description);
            eventDescription.setText(currentEvent.getmEventDetails());

            TextView eventDate = (TextView) lv.findViewById(R.id.event_date);
            eventDate.setText(currentEvent.getmEventDate());

            ImageView eventImage = (ImageView) lv.findViewById(R.id.list_item_icon);
            eventImage.setImageResource(currentEvent.getmImageResourceId());
            return lv;
        }

        if (getItem(position) instanceof Photo) {

            if (lv == null) {
                lv = LayoutInflater.from(getContext()).inflate(R.layout.list_item_photo_list, parent, false);
            }

            Photo currentEvent = (Photo) getItem(position);

            TextView thumbnailDescription = (TextView) lv.findViewById(R.id.thumbnail_description);
            thumbnailDescription.setText(currentEvent.getmDesc());

            ImageView thumbnail = (ImageView) lv.findViewById(R.id.thumbnail);
            thumbnail.setImageResource(currentEvent.getmImageResourceId());
        }

        return lv;
    }
}
