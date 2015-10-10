package com.example.aanchal.legistify;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.drm.DrmStore;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomDialogFragment extends DialogFragment {

    String field;
    String city;
    String state;

    public interface CustomDialogListener{

        public void onDialogPositiveClick(DialogFragment dialogFragment, String field, String city, String state);

     //   public void onDialogNegitiveClick(DialogFragment dialogFragment);

    }

    CustomDialogListener customDialogListener;

    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            customDialogListener=(CustomDialogListener) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+"must implement listener");
        }
    }

    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_DARK);
        LayoutInflater layoutInflater=getActivity().getLayoutInflater();
        final View v=layoutInflater.inflate(R.layout.dialog_filter,null);
        Spinner fieldSpinner=(Spinner)v.findViewById(R.id.fieldSpinner);
        ArrayAdapter<CharSequence> field_adapter=ArrayAdapter.createFromResource(getActivity(), R.array.law_field, android.R.layout.simple_spinner_item);
        field_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fieldSpinner.setAdapter(field_adapter);
        fieldSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                field=adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner citySpinner=(Spinner)v.findViewById(R.id.citySpinner);
        ArrayAdapter<CharSequence> city_adapter=ArrayAdapter.createFromResource(getActivity(),R.array.city, android.R.layout.simple_spinner_item);
        city_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        citySpinner.setAdapter(city_adapter);
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                city=adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner stateSpinner=(Spinner)v.findViewById(R.id.stateSpinner);
        ArrayAdapter<CharSequence> state_adapter=ArrayAdapter.createFromResource(getActivity(),R.array.state, android.R.layout.simple_spinner_item);
        state_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(state_adapter);
        stateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                state = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        builder.setView(v).setMessage("Apply Filters").setPositiveButton("Apply", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                customDialogListener.onDialogPositiveClick(CustomDialogFragment.this, field, city, state);

            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                CustomDialogFragment.this.getDialog().cancel();
            }
        });

       /* Dialog dialog=builder.show();

        int textViewId = dialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null);
        TextView tv = (TextView) dialog.findViewById(textViewId);
        tv.setTextColor(getResources().getColor(R.color.blue));*/
        return builder.create();
    }


}
