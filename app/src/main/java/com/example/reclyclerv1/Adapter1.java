package com.example.reclyclerv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reclyclerv1.Element_list;
import com.example.reclyclerv1.R;

import java.util.ArrayList;

 class Adapter1 extends RecyclerView.Adapter<Adapter1.DataHolder> {//Adapter

    public ArrayList<Element_list> mElementitems;//creating arraylist
    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.element_list,parent,false);
        DataHolder dataHolder=new DataHolder(v);
        return dataHolder;//to  return viewholder object
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {
       // holder.textView.setText(nameArray[position]);
       // holder.imageView.setImageResource(imageArray[position]);
        Element_list currentItem=mElementitems.get(position);
        holder.mImage.setImageResource(currentItem.getImage());
        holder.mText1.setText(currentItem.getText1());
        holder.mText2.setText(currentItem.getText2());

    }

    @Override
    public int getItemCount() {
        return mElementitems.size();
    }
    public class DataHolder extends RecyclerView.ViewHolder {//ViewHolder
        ImageView mImage;
        TextView  mText1;
        TextView  mText2;
        public DataHolder(@NonNull View itemView) {
            super(itemView);
            mImage=itemView.findViewById(R.id.image1);
            mText1=itemView.findViewById(R.id.sub1);
            mText2=itemView.findViewById(R.id.con1);

        }

    }
    public Adapter1(ArrayList<Element_list> element_items)//constructor
    {
        mElementitems=element_items;
    }


}
