package com.example.recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.User_Holder>
{
    Activity activity;
    ArrayList arrayList;
    String [] lovershayri;
    public Recycler_Adapter(Activity activity, String[] loveshayri, ArrayList arrayList) {
        this.activity=activity;
        this.lovershayri=loveshayri;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public Recycler_Adapter.User_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.recycler_item,parent,false);
        User_Holder user_holder=new User_Holder(view);
        return user_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recycler_Adapter.User_Holder holder, int position)
    {
        holder.textView.setText(""+arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return lovershayri.length;
    }

    public class User_Holder extends RecyclerView.ViewHolder {
        TextView textView;
        public User_Holder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.item_txt);

        }
    }
}
