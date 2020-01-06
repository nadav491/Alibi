package com.example.alibi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import shared.Meeting;

public class MeetingListAdapter extends ArrayAdapter<Meeting> {
    private Context mContext;
    private int mResource;

    public MeetingListAdapter(Context context, int resource, ArrayList<Meeting> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Meeting m = new Meeting();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);
        TextView other = convertView.findViewById(R.id.other);
        other.setText(getItem(position).getOtherGuy());
        return other;
    }


    }
