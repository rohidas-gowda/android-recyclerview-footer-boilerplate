package com.andromojo.recyclerviewfooter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FooterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int FOOTER_VIEW = 1;
    private ArrayList<String> data;
    private Context context;

    public FooterAdapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public class FooterViewHolder extends ViewHolder{
        public FooterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType == FOOTER_VIEW){
            view = LayoutInflater.from(context).inflate(R.layout.footer_item, parent, false);
            FooterAdapter.FooterViewHolder footerViewHolder = new FooterAdapter.FooterViewHolder(view);
            return footerViewHolder;
        }

        view = LayoutInflater.from(context).inflate(R.layout.normal_item, parent, false);
        FooterAdapter.NormalViewHolder normalViewHolder = new FooterAdapter.NormalViewHolder(view);
        return  normalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        try {
            if (holder instanceof FooterAdapter.NormalViewHolder) {
                FooterAdapter.NormalViewHolder normalViewHolder = (FooterAdapter.NormalViewHolder) holder;
                normalViewHolder.bindView(position);
            } else if (holder instanceof FooterAdapter.FooterViewHolder) {
                FooterAdapter.FooterViewHolder footerViewHolder = (FooterAdapter.FooterViewHolder) holder;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        if (data == null) {
            return 0;
        }

        if (data.size() == 0) {
            return 1;
        }
        return data.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == data.size()) {
            return FOOTER_VIEW;
        }
        return super.getItemViewType(position);
    }

    private class ViewHolder extends RecyclerView.ViewHolder{
        TextView normal_item;
        public ViewHolder(View itemView) {
            super(itemView);
            normal_item = (TextView) itemView.findViewById(R.id.normal_item_text);
        }

        public void bindView(int position) {
            normal_item.setText(data.get(position));
        }
    }
}
