package com.roomie.roomie_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class bookAdapter extends RecyclerView.Adapter<bookAdapter.bkListingViewHolder> {

    private List<bookListing> bookList;

    public bookAdapter(List<bookListing> bookList){this.bookList = bookList;
    }
    @NonNull
    @Override
    public bkListingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_book_listing, parent , false);
        return new bkListingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bkListingViewHolder holder, int position) {
        holder.type.setText(bookList.get(position).getType());
        holder.title.setText(bookList.get(position).getTitle());
        holder.mImageView.setImageResource(bookList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class bkListingViewHolder extends RecyclerView.ViewHolder{

        private TextView type;
        private TextView title;
        private ImageView mImageView;
        public bkListingViewHolder(@NonNull View itemView) {
            super(itemView);
            type = itemView.findViewById(R.id.roomType);
            title = itemView.findViewById(R.id.roomName);
            mImageView = itemView.findViewById(R.id.bk_image);
        }
    }
}