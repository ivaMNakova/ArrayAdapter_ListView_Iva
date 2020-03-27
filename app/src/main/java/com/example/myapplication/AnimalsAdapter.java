package com.example.myapplication;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalsAdapter extends ArrayAdapter<Animal> {

    public AnimalsAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

Animal animal = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.animal_layot, parent, false);
        }

        TextView animalTextView = (TextView) convertView.findViewById(R.id.animalTextView);
        ImageView animalImage = (ImageView) convertView.findViewById(R.id.animalImage);

        animalImage.setImageResource(R.drawable.cat2);
        animalTextView.setText(animal.getName());

        if (animal.getName() == "Awkward cat") {
            animalImage.setImageResource(R.drawable.cat1);
        }
        else if (animal.getName() == "Quarantine cat") {
            animalImage.setImageResource(R.drawable.cat3);
        }

        return convertView;
    }

}
