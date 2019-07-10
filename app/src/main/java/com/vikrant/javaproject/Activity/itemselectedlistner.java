package com.vikrant.javaproject.Activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class itemselectedlistner implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(adapterView.getContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
