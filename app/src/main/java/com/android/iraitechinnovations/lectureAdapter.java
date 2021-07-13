package com.android.iraitechinnovations;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class lectureAdapter extends ArrayAdapter<lecture> {
    public lectureAdapter(@NonNull Context context, List<lecture> dlecture) {
        super(context, 0,dlecture);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.activity_list_item, parent, false);
        }

        TextView lecName = (TextView) convertView.findViewById(R.id.uName);

        lecture lecture1 = getItem(position);

        lecName.setVisibility(View.VISIBLE);
        lecName.setText(lecture1.getLecture1());

        return convertView;
    }
}
