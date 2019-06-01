package com.hfad.globetrotter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebStorage;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class FlightAdapter extends ArrayAdapter<Carrier> {

    private Context context;
    private int resource;
    private List<Carrier> carrierList;

    public FlightAdapter(@NonNull Context context, int resource, @NonNull List<Carrier> carrierList) {
        super(context, resource, carrierList);
        this.context = context;
        this.resource = resource;
        this.carrierList = carrierList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //just like we did with fragments:
        //inflate a layout, wire widgets, insert data, return the layout
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_flight, parent, false);
        }

        TextView textViewOrigin =
                convertView.findViewById(R.id.textView_flight_origin);
        TextView textViewDestination =
                convertView.findViewById(R.id.textView_flight_destination);
        TextView textViewCarrier =
                convertView.findViewById(R.id.textView_flight_carrier);
        TextView textViewDepart =
                convertView.findViewById(R.id.textView_flight_departdate);
        TextView textViewReturnDate =
                convertView.findViewById(R.id.textView_flight_returndate);

        Carrier currentCarrier = carrierList.get(position);
        textViewCarrier.setText(currentCarrier.getName());
        String origin = ((Activity) context).getIntent().getStringExtra("origin");
        String destination = ((Activity) context).getIntent().getStringExtra("destination");
        String depart = ((Activity) context).getIntent().getStringExtra("depart");
        String returnDate = ((Activity) context).getIntent().getStringExtra("return");

        textViewOrigin.setText(origin);
        textViewDestination.setText(destination);
        textViewDepart.setText(depart);
        textViewReturnDate.setText(returnDate);
        return convertView;
    }

}