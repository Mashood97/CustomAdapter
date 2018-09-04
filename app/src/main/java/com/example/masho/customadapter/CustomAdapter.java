package com.example.masho.customadapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Masho on 7/24/2018.
 */

public class CustomAdapter extends ArrayAdapter<Model> {
    public CustomAdapter(Activity context, ArrayList<Model> arrayList)
    {
        super(context,0,arrayList);

    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
     View ListitemView = convertView;
     if(ListitemView == null)
     {
         ListitemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
     }
     Model model=getItem(position);

        TextView txt = (TextView)ListitemView.findViewById(R.id.textview1);
        txt.setText(model.getmTextName());


        TextView txt2 = (TextView)ListitemView.findViewById(R.id.textview2);
        txt2.setText(model.getmTextAge());

        ImageView img = (ImageView)ListitemView.findViewById(R.id.img);
        img.setImageResource(model.getmImgRes());
     return ListitemView;
    }
}
