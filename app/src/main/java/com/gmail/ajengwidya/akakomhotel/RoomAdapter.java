package com.gmail.ajengwidya.akakomhotel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {
    private ArrayList<HotelRoom> dataList;
    private int rowLayout;
    private Context context;

    public class RoomViewHolder extends RecyclerView.ViewHolder{
        LinearLayout roomLayout;
        private TextView nama, harga, deskripsi;

        public RoomViewHolder(View itemView){
            super(itemView);

            nama = (TextView) itemView.findViewById(R.id.nama);
            harga = (TextView) itemView.findViewById(R.id.harga);
            deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        }
    }

    public RoomAdapter(ArrayList<HotelRoom> dataList){
        this.dataList = dataList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public RoomAdapter.RoomViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_card_view, parent, false);
        return new RoomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RoomViewHolder holder, int position){
        holder.nama.setText(dataList.get(position).getNama());
        holder.harga.setText(dataList.get(position).getHarga());
        holder.deskripsi.setText(dataList.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount(){
        return(dataList != null) ? dataList.size() : 0;
    }
}
