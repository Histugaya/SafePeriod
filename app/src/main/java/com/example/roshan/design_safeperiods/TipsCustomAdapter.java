package com.example.roshan.design_safeperiods;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TipsCustomAdapter extends RecyclerView.Adapter<TipsCustomAdapter.MyCustomViewHolder> {
    private List<TipsItems> tipslist;

    public TipsCustomAdapter(List<TipsItems> tipslist) {
        this.tipslist = tipslist;
    }

    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_tipspost, parent, false);
        return new MyCustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder holder, int position) {
        TipsItems tipsItems = tipslist.get(position);
        holder.uname.setText(tipsItems.getUsername());
        holder.date1.setText(tipsItems.getDate());
        holder.title1.setText(tipsItems.getTitle());
        holder.description1.setText(tipsItems.getDescription());


    }

    @Override
    public int getItemCount() {
        return tipslist.size();
    }

    public class MyCustomViewHolder extends RecyclerView.ViewHolder {
        private TextView uname;
        private TextView date1;
        private TextView title1;
        private TextView description1;

        public MyCustomViewHolder(View view) {
            super(view);
            uname = itemView.findViewById(R.id.tips_userid);
            date1 = itemView.findViewById(R.id.tips_postDate);
            title1 = itemView.findViewById(R.id.tips_postTitle);
            description1 = itemView.findViewById(R.id.tips_postDescription);
        }
    }
}
