package com.vikrant.javaproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.vikrant.javaproject.R;
import com.vikrant.javaproject.myAdapterlist;

public class custumlistView extends AppCompatActivity {
    String[] maintitle ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };
    Integer imageid[]={
      R.drawable.person2,R.drawable.person,R.drawable.setting,
            R.drawable.person2,R.drawable.person
    };

    ListView list2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custumlist_view);
        list2=findViewById(R.id.customList);
        myAdapterlist adapter=new myAdapterlist(this,maintitle,subtitle,imageid);
        list2.setAdapter(adapter);
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=maintitle[i];
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
            }
        });
    }
}
