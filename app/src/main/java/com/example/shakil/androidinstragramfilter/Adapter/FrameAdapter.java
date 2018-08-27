package com.example.shakil.androidinstragramfilter.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shakil.androidinstragramfilter.R;

import java.util.ArrayList;
import java.util.List;

public class FrameAdapter extends RecyclerView.Adapter<FrameAdapter.FrameViewHolder> {

    Context context;
    List<Integer> frameList;
    FrameAdapterListener listener;

    int row_selected = -1;

    public FrameAdapter(Context context, FrameAdapterListener listener) {
        this.context = context;
        this.frameList = getFramesList();
        this.listener = listener;
    }

    private List<Integer> getFramesList() {
        List<Integer> result = new ArrayList<>();

        result.add(R.drawable.card_1_resize);
        result.add(R.drawable.card_2_resize);
        result.add(R.drawable.card_3_resize);
        result.add(R.drawable.card_4_resize);
        result.add(R.drawable.card_5_resize);
        result.add(R.drawable.card_6_resize);
        result.add(R.drawable.card_7_resize);
        result.add(R.drawable.card_8_resize);
        result.add(R.drawable.card_9_resize);
        result.add(R.drawable.card_10_resize);
        return result;
    }

    @NonNull
    @Override
    public FrameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.frame_item, parent, false);
        return new FrameAdapter.FrameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FrameViewHolder holder, int position) {
        if (row_selected == position){
            holder.img_check.setVisibility(View.VISIBLE);
        }
        else {
            holder.img_check.setVisibility(View.INVISIBLE);
        }

        holder.img_frame.setImageResource(frameList.get(position));
    }

    @Override
    public int getItemCount() {
        return frameList.size();
    }

    public class FrameViewHolder extends RecyclerView.ViewHolder {

        ImageView img_check, img_frame;

        public FrameViewHolder(View itemView) {
            super(itemView);
            img_check = itemView.findViewById(R.id.img_check);
            img_frame = itemView.findViewById(R.id.img_frame);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onFrameSelected(frameList.get(getAdapterPosition()));
                    row_selected = getAdapterPosition();
                    notifyDataSetChanged();
                }
            });
        }
    }

    public interface FrameAdapterListener{
        public void onFrameSelected(int frame);
    }
}
