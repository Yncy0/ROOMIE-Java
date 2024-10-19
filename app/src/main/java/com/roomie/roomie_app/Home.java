package com.roomie.roomie_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    private RecyclerView bookingRecycleView, availableRecycleView, tagsRecycleView;
    private ImageView filterBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        filterBtn = findViewById(R.id.filter);
        filterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, roomDescription.class));
            }
        });

        bookingRecycleView = findViewById(R.id.bookingRV);
        bookingRecycleView.setHasFixedSize(true);
        bookingRecycleView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));


        List<bookListing> bookList = new ArrayList<>();

        bookList.add(new bookListing(R.drawable.room1 , "SN 101", "Computer Room"));
        bookList.add(new bookListing(R.drawable.room2 , "SN 102", "Computer Room"));
        bookList.add(new bookListing(R.drawable.room3 , "SN 103", "Computer Room"));
        bookList.add(new bookListing(R.drawable.room4 , "SN 104", "Class Room"));
        bookList.add(new bookListing(R.drawable.room5 , "SN 105", "Class Room"));
        bookList.add(new bookListing(R.drawable.room6 , "SN 106", "Class Room"));

        bookAdapter bkListAdapter = new bookAdapter(bookList);
        bookingRecycleView.setAdapter(bkListAdapter);



        availableRecycleView = findViewById(R.id.availableRV);
        availableRecycleView.setHasFixedSize(true);
        availableRecycleView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));


        List<availableRoomsListing> avRoomList = new ArrayList<>();

        avRoomList.add(new availableRoomsListing(R.drawable.room1 , "SN 101", "Computer Room"));
        avRoomList.add(new availableRoomsListing(R.drawable.room2 , "SN 102", "Computer Room"));
        avRoomList.add(new availableRoomsListing(R.drawable.room3 , "SN 103", "Computer Room"));
        avRoomList.add(new availableRoomsListing(R.drawable.room4 , "SN 104", "Class Room"));
        avRoomList.add(new availableRoomsListing(R.drawable.room5 , "SN 105", "Class Room"));
        avRoomList.add(new availableRoomsListing(R.drawable.room6 , "SN 106", "Class Room"));

        availableRoomsAdapter avRoomListAdapter = new availableRoomsAdapter(avRoomList);
        availableRecycleView.setAdapter(avRoomListAdapter);


        tagsRecycleView = findViewById(R.id.tagsRV);
        tagsRecycleView.setHasFixedSize(true);
        tagsRecycleView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));


        List<tagsListing> tagsList = new ArrayList<>();

        tagsList.add(new tagsListing("ComLab"));
        tagsList.add(new tagsListing("Computer"));
        tagsList.add(new tagsListing("Lib"));
        tagsList.add(new tagsListing("Classroom"));
        tagsList.add(new tagsListing("Laboratory"));
        tagsList.add(new tagsListing("Faculty"));

        tagsAdapter tagListAdapter = new tagsAdapter(tagsList);
        tagsRecycleView.setAdapter(tagListAdapter);


    }
}