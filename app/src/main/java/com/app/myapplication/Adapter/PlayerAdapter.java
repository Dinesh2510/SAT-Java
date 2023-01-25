package com.app.myapplication.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.app.myapplication.databinding.ItemPlayerListBinding;
import com.app.myapplication.retrofit.Response.PlayerDataModelled;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.MyViewHolder> {
    List<PlayerDataModelled> conVideoArrayList;
    Context context;
    SharedPreferences sharedPreferences;
    String str_userid;
    private AdapterClickListener listener;


    public PlayerAdapter(List<PlayerDataModelled> conVideoArrayList, AppCompatActivity context, AdapterClickListener listener) {
        this.conVideoArrayList = conVideoArrayList;
        this.context = context;
        this.listener = listener;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemPlayerListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        final PlayerDataModelled playerDataModelled = conVideoArrayList.get(position);


        Log.e("TAG_tatta", String.valueOf("onBindViewHolder: " + playerDataModelled.getIskeeper() == null));
        if (!(playerDataModelled.getIskeeper() == null) && playerDataModelled.getIskeeper()) {
            holder.binding.name.setText(Html.fromHtml("<b>" + "\u2022 " + playerDataModelled.getNameFull() + "(wk)" + "<b>"));
        } else if (!(playerDataModelled.getIscaptain() == null) && playerDataModelled.getIscaptain()) {
            holder.binding.name.setText(Html.fromHtml("<b>" + "\u2022 " + playerDataModelled.getNameFull() + "(c)" + "<b>"));
        } else if (!(playerDataModelled.getIscaptain() == null) && !(playerDataModelled.getIskeeper() == null) && playerDataModelled.getIscaptain() && playerDataModelled.getIskeeper()) {
            holder.binding.name.setText(Html.fromHtml("<b>" + "\u2022 " + playerDataModelled.getNameFull() + "(c  & wk)" + "<b>"));
        } else {
            holder.binding.name.setText("\u2022 " + playerDataModelled.getNameFull());
        }

        holder.binding.lytMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(view, position, playerDataModelled);
            }
        });
    }

    @Override
    public int getItemCount() {
        return conVideoArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ItemPlayerListBinding binding;

        public MyViewHolder(ItemPlayerListBinding rowXmlViewBinding) {
            super(rowXmlViewBinding.getRoot());
            this.binding = rowXmlViewBinding;
        }

    }
}
