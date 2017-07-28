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


    private HistoricalEvents currentEvent = null;
    private tmpClass tmpEvent = null;

    public ListAdapter(Context context, ArrayList<Object> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View lv = convertView;

        if (lv == null) {
            lv = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        if (getItem(position) instanceof HistoricalEvents) {

            currentEvent = (HistoricalEvents) getItem(position);

            TextView eventTitle = (TextView) lv.findViewById(R.id.event_title);
            eventTitle.setText(currentEvent.getmEventTitle());


            TextView eventDescription = (TextView) lv.findViewById(R.id.event_description);
            eventDescription.setText(currentEvent.getmEventDetails());

            TextView eventDate = (TextView) lv.findViewById(R.id.event_date);
            eventDate.setText(currentEvent.getmEventDate());

            ImageView eventImage = (ImageView) lv.findViewById(R.id.list_item_icon);
            eventImage.setImageResource(currentEvent.getmImageResourceId());
            return lv;

        }else if (getItem(position) instanceof tmpClass) {

            tmpEvent = (tmpClass) getItem(position);

            TextView tmp1 = (TextView) lv.findViewById(R.id.event_title);
            tmp1.setText(tmpEvent.getTmp1());


            TextView tmp2 = (TextView) lv.findViewById(R.id.event_description);
            tmp2.setText(tmpEvent.getTmp2());

            TextView tmp3 = (TextView) lv.findViewById(R.id.event_date);
            tmp3.setText(tmpEvent.getTmp3());
            return lv;

        }

        return lv;
    }
}
