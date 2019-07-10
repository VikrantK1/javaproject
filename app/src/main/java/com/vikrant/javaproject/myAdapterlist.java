package com.vikrant.javaproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapterlist extends ArrayAdapter<String> {
    Activity context;
    String [] maintitle;
    String [] subtitle;
    Integer [] imgid;

    public myAdapterlist(Activity context,String[] maintitle,String []Subtitle,Integer []imgid)
    {
        super(context,R.layout.list2,maintitle);
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=Subtitle;
        this.imgid=imgid;

    }
    public View getView(int position, View view , ViewGroup parent)
    {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list2,null,true);
        TextView title=rowView.findViewById(R.id.mainTitle);
        ImageView image=rowView.findViewById(R.id.imagelist);
        TextView subTitle=rowView.findViewById(R.id.subtitle);
        title.setText(maintitle[position]);
        image.setImageResource(imgid[position]);
        subTitle.setText(subtitle[position]);
        return  rowView;
    }
}
