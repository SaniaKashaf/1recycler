package com.example.forchecking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterTask extends RecyclerView.Adapter<AdapterTask.viewHolder> {
    private Context context;
    private List<ModelClass> modelClasses;

    public AdapterTask(Context context, List<ModelClass> modelClasses) {
        this.context = context;
        this.modelClasses = modelClasses;
    }

    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragmentlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
holder.textView.setText(modelClasses.get(position).getText());
holder.imageView.setImageResource(modelClasses.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{

    TextView textView;
    ImageView imageView;
    CardView cardView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
     textView=itemView.findViewById(R.id.txt_recyclerOne);
     imageView=itemView.findViewById(R.id.image_recyclerOne);
     cardView=itemView.findViewById(R.id.cardview_recyclerOne);





        }
    }
}
