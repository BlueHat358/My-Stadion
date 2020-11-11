package com.bluehat.mystadion.Utils;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bluehat.mystadion.DetailActivity;
import com.bluehat.mystadion.MainActivity;
import com.bluehat.mystadion.Model.StadionModel;
import com.bluehat.mystadion.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.bluehat.mystadion.Utils.Keys.*;

public class StadionAdapter extends RecyclerView.Adapter<StadionAdapter.viewHolder>{
    ArrayList<StadionModel> list;

    public StadionAdapter(ArrayList<StadionModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist, parent, false);
        return new StadionAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int position) {
        final StadionModel stadion = list.get(position);

        holder.image.setImageResource(stadion.getImage(position,0));
        holder.content.setText(stadion.getContent());
        holder.title.setText(stadion.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(STATE, "onClick: " + position);
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra(POS, position);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView title, content;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imgImage_ItemList);
            title = itemView.findViewById(R.id.tvTitle_ItemList);
            content = itemView.findViewById(R.id.tvContent_ItemList);
        }
    }
}
