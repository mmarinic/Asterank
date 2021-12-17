package com.marinic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Asterank> asteranks;
    private LayoutInflater layoutInflater;
    private ItemClickInterface itemClickInterface;

    public AdapterListe(Context context){
        layoutInflater = LayoutInflater.from(context);
    }

    public void setAsteranks(List<Asterank> asteranks) {
        this.asteranks = asteranks;
    }

    public Asterank getAsterank(int position) {
        return asteranks.get(position);
    }

    @Override
    public Red onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.red_liste,parent,false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red holder, int position) {
        Asterank asterank = asteranks.get(position);
        holder.asterank.setText(asterank.getReadableDes());

    }

    public class Red extends RecyclerView.ViewHolder implements  View.OnClickListener{

        private TextView asterank;

        public Red(View view){
            super(view);
            asterank = view.findViewById(R.id.asterank);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(itemClickInterface != null){
                itemClickInterface.onItemClick(v,getAdapterPosition());
            }
        }
    }


    public void setClickListener(ItemClickInterface clickListener) {
        this.itemClickInterface=clickListener;
    }

    public interface ItemClickInterface{
        void onItemClick(View view, int position);
    }

    @Override
    public int getItemCount() {

        return asteranks==null ? 0 : asteranks.size();
    }

}
