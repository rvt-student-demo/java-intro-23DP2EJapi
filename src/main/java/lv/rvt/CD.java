package lv.rvt;

public class CD implements Packable{

    private String artist;
    private String CDtitle;
    private double weight;
    private int publicationYear;

    public CD(String author, String title, int publicationYear){
        this.artist = author;
        this.CDtitle = title;
        this.weight = 0.1;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ":" + this.CDtitle + "(" + this.publicationYear + ")"; 
    }
    





}
