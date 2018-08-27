package com.example.shakil.androidinstragramfilter.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shakil.androidinstragramfilter.R;

import java.util.ArrayList;
import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {

    Context context;
    List<Integer> colorList;
    ColorAdapterListener listener;

    public ColorAdapter(Context context, ColorAdapterListener listener) {
        this.context = context;
        this.colorList = genColorList();
        this.listener = listener;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.color_item, parent, false);
        return new ColorViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {
        holder.color_section.setCardBackgroundColor(colorList.get(position));
    }

    @Override
    public int getItemCount() {
        return colorList.size();
    }

    public class ColorViewHolder extends RecyclerView.ViewHolder {

        public CardView color_section;

        public ColorViewHolder(View itemView) {
            super(itemView);

            color_section = itemView.findViewById(R.id.color_section);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onColorSelected(colorList.get(getAdapterPosition()));
                }
            });
        }
    }

    private List<Integer> genColorList() {
        List<Integer> colorList = new ArrayList<>();
        colorList.add(Color.parseColor("#131722"));
        colorList.add(Color.parseColor("#00f7ff"));
        colorList.add(Color.parseColor("#00ffff"));
        colorList.add(Color.parseColor("#ffbfc2"));
        colorList.add(Color.parseColor("#bffffc"));
        colorList.add(Color.parseColor("#bfe2ff"));
        colorList.add(Color.parseColor("#ffbfe2"));
        colorList.add(Color.parseColor("#464646"));
        colorList.add(Color.parseColor("#666666"));
        colorList.add(Color.parseColor("#00f5ff"));
        colorList.add(Color.parseColor("#a5f6f3"));
        colorList.add(Color.parseColor("#abe6f2"));
        colorList.add(Color.parseColor("#f9d7f3"));
        colorList.add(Color.parseColor("#66ffff"));
        colorList.add(Color.parseColor("#5eecfd"));
        colorList.add(Color.parseColor("#fef47a"));
        colorList.add(Color.parseColor("#ccdb84"));
        colorList.add(Color.parseColor("#bbc59e"));
        colorList.add(Color.parseColor("#00a3aa"));
        colorList.add(Color.parseColor("#0087ab"));
        colorList.add(Color.parseColor("#f9a842"));
        colorList.add(Color.parseColor("#e88876"));
        colorList.add(Color.parseColor("#2c8e40"));
        colorList.add(Color.parseColor("#ffbfbf"));
        colorList.add(Color.parseColor("#a7cbeb"));
        colorList.add(Color.parseColor("#ffebd5"));
        colorList.add(Color.parseColor("#fff9d5"));
        colorList.add(Color.parseColor("#50677b"));
        colorList.add(Color.parseColor("#00c5cd"));
        colorList.add(Color.parseColor("#70a4ff"));
        colorList.add(Color.parseColor("#cc70ff"));
        colorList.add(Color.parseColor("#500d00"));
        colorList.add(Color.parseColor("#badb3d"));
        colorList.add(Color.parseColor("#00ced1"));
        colorList.add(Color.parseColor("#ffa500"));
        colorList.add(Color.parseColor("#99c809"));
        colorList.add(Color.parseColor("#baec16"));
        colorList.add(Color.parseColor("#80c635"));
        colorList.add(Color.parseColor("#15c3b9"));
        colorList.add(Color.parseColor("#03469a"));
        colorList.add(Color.parseColor("#8d83f6"));
        return colorList;
    }

    public interface ColorAdapterListener {
        void onColorSelected(int color);
    }
}
