package com.example.three_recyclerview.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.three_recyclerview.Model.MyTeamModel;
import com.example.three_recyclerview.R;

import java.util.ArrayList;

public class MyTeamAdapter extends RecyclerView.Adapter<MyTeamAdapter.viewHolder> {
    ArrayList<MyTeamModel> teamList;
    Context context;

    public MyTeamAdapter(ArrayList<MyTeamModel> teamList, Context context) {
        this.teamList = teamList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyTeamAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.myteamlist,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyTeamAdapter.viewHolder holder, int position) {

        MyTeamModel MyTeamModel=teamList.get(position);
        holder.teamImg.setImageResource(MyTeamModel.getImage());
        holder.teamText1.setText(MyTeamModel.getTxt1());

        holder.linearLayout.setBackgroundColor(Color.parseColor(MyTeamModel.getColor()));
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }


    public void filterList(ArrayList<MyTeamModel> filteredList2) {
        teamList=filteredList2;
        notifyDataSetChanged();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView teamText1;
        ImageView teamImg;
       LinearLayout linearLayout;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            teamText1=itemView.findViewById(R.id.tv3);
            linearLayout=itemView.findViewById(R.id.linearlayout1);
            teamImg =itemView.findViewById(R.id.team);


        }
}}
