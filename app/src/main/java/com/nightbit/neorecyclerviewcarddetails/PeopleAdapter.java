package com.nightbit.neorecyclerviewcarddetails;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {
    ArrayList<People> mArrayList;

    public PeopleAdapter(ArrayList<People> mArrayList) {
        this.mArrayList = mArrayList;
    }

    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(PeopleAdapter.ViewHolder holder, int position) {
        People peopleList = mArrayList.get(position);
        holder.fname.setText(peopleList.getmFirstname());
        holder.lname.setText(peopleList.getmLastname());
        holder.txtsubject.setText(peopleList.getmSubject());

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView fname;
        TextView lname;
        TextView txtsubject;
        public ViewHolder(View itemView) {
            super(itemView);
            fname = itemView.findViewById(R.id.fname);
            txtsubject = itemView.findViewById(R.id.txtsubject);
            lname = itemView.findViewById(R.id.lname);
        }
    }

}
