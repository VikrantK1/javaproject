package com.vikrant.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listrelated extends AppCompatActivity {
ListView list;
TextView text;
String []listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listrelated);
      list=findViewById(R.id.listview);
      text=findViewById(R.id.textview);
      listItem=getResources().getStringArray(R.array.array_technology);
        ArrayAdapter<String> ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                android.R.id.text1,listItem);
        list.setAdapter(ad);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String value=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
            }
        });
    }
}
