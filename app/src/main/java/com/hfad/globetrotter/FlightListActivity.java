package com.hfad.globetrotter;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightListActivity extends AppCompatActivity {

    private ListView flights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_list);

        wireWidgets();

        populateListView();

        registerForContextMenu(flights);

    }

    private void populateListView() {
        Carrier[] carrierArray;
        Parcelable[] parcArray = getIntent().getParcelableArrayExtra("carriers");
        List<Carrier> carriers = new ArrayList<>();
        for(Parcelable p : parcArray)
        {
            carriers.add((Carrier) p);
        }
        FlightAdapter arrayAdapter = new FlightAdapter(this, android.R.layout.simple_list_item_1, carriers);
        flights.setAdapter(arrayAdapter);
    }

    private void wireWidgets() {
        flights = findViewById(R.id.listView_flightListActivity_list);
    }
}