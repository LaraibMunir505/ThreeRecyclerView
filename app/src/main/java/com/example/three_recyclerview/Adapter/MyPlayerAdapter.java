package com.example.three_recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.three_recyclerview.Model.MyPlayerModel;
import com.example.three_recyclerview.R;

import java.util.ArrayList;

public class MyPlayerAdapter extends RecyclerView.Adapter<MyPlayerAdapter.viewHolder> {

    ArrayList<MyPlayerModel> myplayerList;
    Context context;

    public MyPlayerAdapter(ArrayList<MyPlayerModel> playerList, Context context) {
        this.myplayerList = playerList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.myplayerlist,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        MyPlayerModel myPlayerModel=myplayerList.get(position);
        holder.img1.setImageResource(myPlayerModel.getImg());
        holder.tv1.setText(myPlayerModel.getTv1());
        holder.tv2.setText(myPlayerModel.getTv2());
    }

    @Override
    public int getItemCount() {
        return  myplayerList.size();
    }



    public void filterList(ArrayList<MyPlayerModel> filteredList3) {
       myplayerList=filteredList3;
        notifyDataSetChanged();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tv1,tv2;
        ImageView img1;
        LinearLayout linearLayout2;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv6);
            tv2=itemView.findViewById(R.id.tv7);
            img1=itemView.findViewById(R.id.player);
            linearLayout2=itemView.findViewById(R.id.linearlayout2);
        }
    }
}
