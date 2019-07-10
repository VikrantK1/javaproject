package com.vikrant.javaproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Toolbar;

import com.vikrant.javaproject.R;
import com.vikrant.javaproject.checkBox;

public class MainActivity extends AppCompatActivity {
    Button btn=null;
    ToggleButton toggle1=null;
    ToggleButton toggle3=null;
    Button nextActivity=null;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setActionBar(toolbar);
        initiation();
    }
    public void initiation()
    {

        btn=findViewById(R.id.submit);
        toggle1=findViewById(R.id.toggle1);
        toggle3=findViewById(R.id.toggle2);
        nextActivity=findViewById(R.id.nextPage);
                   btn.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           StringBuilder result=new StringBuilder();
                           result.append("Togglebtn1:=").append(toggle1.getText());
                           result.append("ToggleBtn2:=").append(toggle3.getText());
                           Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                           Log.d("Toggle button",result.toString());
                       }
                   });

    nextActivity.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this, checkBox.class);
            startActivity(intent);
        }
    });

    }

}
