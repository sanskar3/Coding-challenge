package com.sanskar.test;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);

        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());

        Picasso.get().load(listItem.getImageUrl()).into(holder.imageView);

        holder.textViewStar.setText(String.valueOf(listItem.getRating()));


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewHead;
        public TextView textViewDesc;
        public ImageView imageView;
        public TextView  textViewStar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.name);
            textViewDesc = (TextView) itemView.findViewById(R.id.language);
            imageView = (ImageView) itemView.findViewById(R.id.userPic);
            textViewStar= itemView.findViewById(R.id.star);
        }
    }
}
