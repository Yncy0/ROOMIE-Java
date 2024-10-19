package com.roomie.roomie_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class availableRoomsAdapter extends RecyclerView.Adapter<availableRoomsAdapter.avRoomListingViewHolder> {

    private List<availableRoomsListing> avRoomList;

    public availableRoomsAdapter(List<availableRoomsListing> avRoomList){this.avRoomList = avRoomList;
    }
    @NonNull
    @Override
    public avRoomListingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_available_rooms_listing, parent , false);
        return new avRoomListingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull avRoomListingViewHolder holder, int position) {
        holder.type.setText(avRoomList.get(position).getType());
        holder.title.setText(avRoomList.get(position).getTitle());
        holder.mImageView.setImageResource(avRoomList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return avRoomList.size();
    }

    public class avRoomListingViewHolder extends RecyclerView.ViewHolder{

        private TextView type;
        private TextView title;
        private ImageView mImageView;
        public avRoomListingViewHolder(@NonNull View itemView) {
            super(itemView);
            type = itemView.findViewById(R.id.roomType);
            title = itemView.findViewById(R.id.roomName);
            mImageView = itemView.findViewById(R.id.bk_image);
        }
    }
}