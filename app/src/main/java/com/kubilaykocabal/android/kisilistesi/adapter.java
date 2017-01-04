package com.kubilaykocabal.android.kisilistesi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 29.12.2016.
 */

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mkisi_ad;
        public TextView mkisi_yas;

        public ViewHolder(View itemView) {
            super(itemView);

            mkisi_ad = (TextView)itemView.findViewById(R.id.kisi_ad);
            mkisi_yas = (TextView)itemView.findViewById(R.id.kisi_yas);


        }
    }

    List<person> list_person;
    public adapter(List<person> liste_person){
        this.list_person=liste_person;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ekran,parent,false);
        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mkisi_yas.setText(list_person.get(position).getMkisi_ad());
        holder.mkisi_yas.setText(list_person.get(position).getMkisi_yas());
    }

    @Override
    public int getItemCount() {
        return list_person.size();
    }


}
