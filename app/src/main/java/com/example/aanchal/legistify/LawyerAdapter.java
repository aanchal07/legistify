package com.example.aanchal.legistify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by aanchal on 6/10/15.
 */

/**
 * Created by dell pc on 27-09-2015.
 */
public class LawyerAdapter extends ArrayAdapter<Lawyer> {

    Context context;
    ArrayList<Lawyer> arr;
    LayoutInflater l;

    public LawyerAdapter(Context context,  ArrayList<Lawyer> arr,LayoutInflater l) {
        super(context, R.layout.lawyer_item_layout);
        this.context=context;
        this.arr=arr;
        this.l=l;
    }

    public int getCount() {
        return arr.size();
    }

    public int getItemViewCount()
    {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        v = l.inflate(R.layout.lawyer_item_layout,null);
        TextView name=(TextView)v.findViewById(R.id.name);
        TextView field=(TextView)v.findViewById(R.id.field);
        TextView address=(TextView)v.findViewById(R.id.address);
        TextView city=(TextView)v.findViewById(R.id.city);
        TextView state=(TextView)v.findViewById(R.id.state);
        TextView contactNumber=(TextView)v.findViewById(R.id.contactNumber);
        Lawyer lawyer=arr.get(position);
        name.setText(lawyer.name);
        field.setText(lawyer.field);
        address.setText(lawyer.address);
        city.setText(lawyer.city);
        state.setText(lawyer.state);
        contactNumber.setText(lawyer.contactNumber);
        return v;
    }
}
