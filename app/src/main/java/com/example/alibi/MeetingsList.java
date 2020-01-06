package com.example.alibi;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alibi.R;

import java.util.ArrayList;

import shared.Meeting;

public class MeetingsList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meetings_list);
        ListView list = (ListView) findViewById(R.id.theList);

        ArrayList<Meeting> names = new ArrayList<>();
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());
        names.add(new Meeting());

        MeetingListAdapter adapter = new MeetingListAdapter(this, R.layout.meetings_item, names);
        list.setAdapter(adapter);

    }
}
