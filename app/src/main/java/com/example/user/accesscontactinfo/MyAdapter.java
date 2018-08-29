package com.example.user.accesscontactinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<Contacts> objectList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<Contacts> objectList)
    {
        inflater=LayoutInflater.from(context);
        this.objectList=objectList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.contact_list_item,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Contacts current=objectList.get(position);
        holder.setData(current,position);
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName,tvPhone;
        public MyViewHolder(View view) {
            super(view);
            tvName=view.findViewById(R.id.txtname);
            tvPhone=view.findViewById(R.id.txtphno);
        }

        public void setData(Contacts current, int position) {
            this.tvName.setText(current.getName());
            this.tvPhone.setText(current.getPhone());
        }
    }
}
