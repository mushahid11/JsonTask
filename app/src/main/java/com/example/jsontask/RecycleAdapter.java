package com.example.jsontask;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>{
    List< CustomModel > list;
    Context context;
    public RecycleAdapter(Context context, ArrayList<CustomModel> arrayList) {
        this.context = context;
        this.list = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tx_name.setText(list.get(position).getName());
        holder.tx_english.setText(list.get(position).getEnglish());
        holder.tx_urdu.setText(list.get(position).getUrdu());
        holder.tx_maths.setText(list.get(position).getMaths());
        holder.tx_chemistry.setText(list.get(position).getChemistry());
        holder.tx_physics.setText(list.get(position).getPhysics());
        holder.tx_biology.setText(list.get(position).getBiology());
    }

    @Override
    public int getItemCount() {
        Log.e("jdvhjvjdvhv", "getItemCount: "+list.size() );
        return list.size();
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tx_name,tx_english,tx_urdu,tx_maths,tx_chemistry,tx_physics,tx_biology;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tx_name = itemView.findViewById(R.id.tv_Name);
            tx_english = itemView.findViewById(R.id.tv_English);
            tx_urdu = itemView.findViewById(R.id.tv_Urdu);
            tx_maths = itemView.findViewById(R.id.tv_Maths);
            tx_chemistry = itemView.findViewById(R.id.tv_Chemistry);
            tx_physics = itemView.findViewById(R.id.tv_Physics);
            tx_biology = itemView.findViewById(R.id.tv_Biology);

        }
    }

}
