package net.uniquecomputer.radiostation;

public class Song {

    private String title;


    // why are you using int for image "your images in drawable folder"
    private int image;

    public Song(String title, int image) {
        this.title = title;     //Set Title
        this.image = image;     //set Image.
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
