package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Modules> {

    private ArrayList<Modules> modules;
    private Context context;
    private TextView tvCodeName;
    private ImageView imageIcon;

    public ModuleAdapter(Context context, int resource, ArrayList<Modules> objects){
        super(context, resource, objects);
        modules = objects;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.modules_row, parent, false);

        tvCodeName = rowView.findViewById(R.id.tvCode);
        imageIcon = rowView.findViewById(R.id.ivIcon);

        Modules currentFood = modules.get(position);

        tvCodeName.setText(currentFood.getCode());
        if(currentFood.isImage()) {
            imageIcon.setImageResource(R.drawable.prog);
        }
        else {
            imageIcon.setImageResource(R.drawable.nonprog);
        }
        return rowView;
    }
}
