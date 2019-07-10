package com.vikrant.javaproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import com.vikrant.javaproject.R;

public class RadioButton extends AppCompatActivity {
Toolbar toolbar;
android.widget.RadioButton btn1,btn2,btn4,d1,d2;
RadioGroup btn3,dg;
 Button b1;
 AlertDialog.Builder builder;
 RelativeLayout rl;
 Dialog dilouge;
 int height=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_radio_button);
        builder=new AlertDialog.Builder(this);
        dilouge=new Dialog(this);
        initilation();
    }
    public void initilation()
    {
        rl=findViewById(R.id.dynamicRadio);
        d1=new android.widget.RadioButton(RadioButton.this);
        d2=new android.widget.RadioButton(RadioButton.this);
        dg=new RadioGroup(RadioButton.this);
        d1.setText("Male");
        d2.setText("Female");
       dg.addView(d1);
       dg.addView(d2);
       dg.setOrientation(RadioGroup.VERTICAL);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                (int) RelativeLayout.LayoutParams.WRAP_CONTENT,
                (int) RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.topMargin=10;
        params.leftMargin=100;
        dg.setLayoutParams(params);
        rl.addView(dg);
       dg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               android.widget.RadioButton temradio=findViewById(i);
               Toast.makeText(getApplicationContext(),temradio.getText(),Toast.LENGTH_LONG).show();
           }
       });
        btn1=findViewById(R.id.radio1);
        btn2=findViewById(R.id.radio2);
       btn3=findViewById(R.id.radioGroup);
        b1=findViewById(R.id.submit);
        clickmethod();
    }
    public void clickmethod()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int selectedId=btn3.getCheckedRadioButtonId();
             btn4=findViewById(selectedId);
             if (selectedId==-1)
             {
                 Toast.makeText(getApplicationContext(),"Nothing is Selected",Toast.LENGTH_LONG).show();
             }
             else
             {
                 Toast.makeText(getApplicationContext(),btn4.getText(),Toast.LENGTH_LONG).show();
             }
             if (btn1.isChecked())
             {
                 Toast.makeText(getApplicationContext(),"Radio1 is Checked",Toast.LENGTH_LONG).show();
             }
                if (btn2.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Radio2 is Checked",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void closeApp(View v)
    {
//     runOnUiThread(new Runnable() {
//         @Override
//         public void run() {
//             builder.setMessage(R.string.dilougeMessage).setTitle(R.string.title).setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                 @Override
//                 public void onClick(DialogInterface dialogInterface, int i) {
//                     finish();
//                     Toast.makeText(getApplicationContext(),"You Chose to close the App",Toast.LENGTH_SHORT).show();
//                 }
//
//             }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//                 @Override
//                 public void onClick(DialogInterface dialogInterface, int i) {
//                     dialogInterface.cancel();
//                     Toast.makeText(getApplicationContext(),"You don't Want to close the App",Toast.LENGTH_SHORT).show();
//                 }
//             }).show();
//         }
//     });

        dilouge.setContentView(R.layout.dilouge);
        dilouge.setTitle("I am Here");
        dilouge.show();


//        builder.setMessage("Do you Want to Close").setCancelable(false).setPositiveButton("yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//             finish();
//             Toast.makeText(getApplicationContext(),"You Chose to close the App",Toast.LENGTH_SHORT).show();
//            }
//        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.cancel();
//                Toast.makeText(getApplicationContext(),"You don't Want to close the App",Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        AlertDialog dilouge=builder.create();
//        dilouge.setTitle("Alert Dilouge box");
//        dilouge.show();
    }
    public void yes(View v)
    {
        finish();
        Toast.makeText(getApplicationContext(),"You Chose to close the App",Toast.LENGTH_SHORT).show();
    }
    public void no(View v)
    {
       dilouge.cancel();
        Toast.makeText(getApplicationContext(),"You don't Want to close the App",Toast.LENGTH_SHORT).show();
    }
    public void newone(View v)
    {
        Intent intent=new Intent(RadioButton.this,spinner.class);
        startActivity(intent);
    }
}
