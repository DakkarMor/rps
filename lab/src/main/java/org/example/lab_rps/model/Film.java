package org.example.lab_rps.model;

public class Film {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }



    public boolean getWatched(){
        return watched;
    }
    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    //@Override
    //public String toString() {
       // return "Film{" +
       //         "id=" + id +
      //          ", title='" + title + '\'' +
      //          ", year=" + year +
        //        ", genre='" + genre + '\'' +
       //         ", watched=" + watched +
       //         '}';
    //}


// + Getters and setters
}

