package com.example.tomi.premiate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tomi on 27/5/2018.
 */

public class Sorteo {
    private String title;
    private String description;
    private int imageId;
    private Context context;
    private View sorteoView;

    public Sorteo (String title, String description, int imageId, Context context){
        this.title = title;
        this.description = description;
        this.imageId = imageId;
        this.context = context;

        this.sorteoView = LayoutInflater.from(context).inflate(R.layout.sorteo_item, null, false);
        parseSorteo();
    }

    public View parseSorteo(){
        ((TextView) sorteoView.findViewById(R.id.sorteoTitle)).setText(getTitle());
        ((TextView) sorteoView.findViewById(R.id.sorteoDescription)).setText(getDescription());
        ((ImageView) sorteoView.findViewById(R.id.sorteoImage)).setImageResource(getImage());
        return sorteoView;
    }

    public View getView(){
        return this.sorteoView;
    }

    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public int getImage(){
        return this.imageId;
    }

}
