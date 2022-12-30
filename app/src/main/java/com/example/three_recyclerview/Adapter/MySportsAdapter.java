package com.example.three_recyclerview.Adapter;

import static android.media.CamcorderProfile.get;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.three_recyclerview.Model.MySportsModel;
import com.example.three_recyclerview.R;

import java.util.ArrayList;

public class MySportsAdapter extends RecyclerView.Adapter<MySportsAdapter.Viewholder> {
    ArrayList<MySportsModel> mysportList;
    Context context;

    public MySportsAdapter(ArrayList<MySportsModel> sportList, Context context) {
        this.mysportList = sportList;
        this.context = context;
    }

    @NonNull
    @Override
    public MySportsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.mysportslist,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MySportsAdapter.Viewholder holder, int position) {


        MySportsModel mySportsModel=mysportList.get(position);
        holder.imageView.setImageResource(mySportsModel.getImg3());
        holder.tv1.setText(mySportsModel.getTv1());
    }

    @Override
    public int getItemCount() {
       return 0;
    }

    public void filterList(ArrayList<MySportsModel> filteredList) {

        mysportList=filteredList;
        notifyDataSetChanged();

    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView tv1;
        ImageView imageView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.tv1);
            imageView = itemView.findViewById(R.id.img1);

        }
    }
}
