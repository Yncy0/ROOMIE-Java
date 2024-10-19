package com.roomie.roomie_app;

public class availableRoomsListing {


    private int image;
    private String title;

    private String type;

    public availableRoomsListing(int image , String title, String type){
        this.image = image;
        this.title = title;
        this.type = type;

    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }
}
