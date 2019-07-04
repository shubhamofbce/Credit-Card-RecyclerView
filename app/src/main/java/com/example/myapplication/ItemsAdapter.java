package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.CardItems> {

    List<Items> CardList;
    Context mCtx;

    public ItemsAdapter(List<Items> cardList, Context mCtx) {
        CardList = cardList;
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public CardItems onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_layout, null);
        return new CardItems(view);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull CardItems holder, int position) {

        //getting the product of the specified position
        Items product = CardList.get(position);

        //binding the data with the viewholder views
        holder.CardNumbertv.setText(product.getCardNumber());
        holder.Nametv.setText(product.getName());
        holder.ExpDatetv.setText(product.getDate());
        if(position%5==0){
        holder.view.setBackgroundResource(R.drawable.layoutbg1);}
        if(position%5==1){
            holder.view.setBackgroundResource(R.drawable.layoutbg2);}
        if(position%5==2){
            holder.view.setBackgroundResource(R.drawable.layoutbg3);}
        if(position%5==3){
            holder.view.setBackgroundResource(R.drawable.layoutbg4);}
        if(position%5==4){
            holder.view.setBackgroundResource(R.drawable.layoutbg5);}
    }

    @Override
    public int getItemCount() {
        return CardList.size();
    }

    public class CardItems extends RecyclerView.ViewHolder {
        TextView CardNumbertv,Nametv,ExpDatetv;
        CardView view;
        public CardItems(@NonNull View itemView) {
            super(itemView);
            CardNumbertv = itemView.findViewById(R.id.cardnumbvertv);
            Nametv = itemView.findViewById(R.id.nametv);
            ExpDatetv = itemView.findViewById(R.id.datetv);
            view = itemView.findViewById(R.id.cardview);
        }
    }
}
