package com.android.learn.dependency.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.learn.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @ explain:
 * @ author：xujun on 2016/10/18 16:42
 * @ email：gdutxiaoxu@163.com
 */
public class ButterknifeAdapter extends RecyclerView.Adapter<ButterknifeAdapter.ViewHolder> {
    List<String> mDatas = new ArrayList<>();


    public ButterknifeAdapter(List<String> mDatas) {
        this.mDatas =mDatas;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       ;

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item, parent, false);

            return new ButterknifeAdapter.ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_name);
        }
    }
}
