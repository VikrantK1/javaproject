package com.vikrant.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.Toolbar;

import com.vikrant.javaproject.Activity.RadioButton;

public class checkBox extends AppCompatActivity {
  CheckBox Science;
  CheckBox  history;
  CheckBox hindi;
  CheckBox math;
  CheckBox custum1;
  CheckBox custum2;
  Button  submit;
  Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        getSupportActionBar().hide();
        toolbar=findViewById(R.id.toolbar);
        setActionBar(toolbar);
        initilation();

    }
    public   void initilation()
    {
        Science=findViewById(R.id.check1);
        history=findViewById(R.id.check2);
        hindi=findViewById(R.id.check3);
        math=findViewById(R.id.check4);
        custum1=findViewById(R.id.Custom1);
        custum2=findViewById(R.id.Custom2);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double fee=0.0;
                StringBuilder result=new StringBuilder();
                result.append("You Actually Like");
                if (Science.isChecked())
                {
                    result.append(" Science");
                    fee+=100;
                }
                if (history.isChecked())
                {
                    result.append(" history");
                    fee+=100;
                }
                if (hindi.isChecked())
                {
                    result.append(" hindi");
                    fee+=50;
                }
                if (math.isChecked())
                {
                    result.append(" Math");
                    fee+=50;
                }
                if (custum1.isChecked())
                {
                    result.append("Custom1 is Checked");
                }

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();

            }
        });

    }
    public void nextActivity(View v)
    {
       Intent intent=new Intent(checkBox.this, RadioButton.class);
       startActivity(intent);
    }
}
