package com.roomie.roomie_app;

public class bookListing {


        private int image;
        private String title;

        private String type;

        public bookListing(int image , String title, String type){
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
