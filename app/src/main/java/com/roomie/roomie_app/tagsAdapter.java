package com.roomie.roomie_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class tagsAdapter extends RecyclerView.Adapter<tagsAdapter.tagsListingViewHolder> {

    private List<tagsListing> tagList;

    public tagsAdapter(List<tagsListing> tagList){this.tagList = tagList;
    }
    @NonNull
    @Override
    public tagsListingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_tags_listing, parent , false);
        return new tagsListingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tagsListingViewHolder holder, int position) {
        holder.tags.setText(tagList.get(position).getTags());

    }

    @Override
    public int getItemCount() {
        return tagList.size();
    }

    public class tagsListingViewHolder extends RecyclerView.ViewHolder{


        private TextView tags;

        public tagsListingViewHolder(@NonNull View itemView) {
            super(itemView);
            tags = itemView.findViewById(R.id.tags_tv);

        }
    }

}
