package models;
import java.util.UUID;


public abstract class Product {
    public final UUID id = UUID.randomUUID();
    protected double price;
    protected String title;
    protected String genre;
    protected String artist;
    protected String seller;

    /**
     *
     * @param price  the price of the product
     * @param title  the title of the product
     * @param genre  the genre of the product
     * @param artist  the artist of the product
     * @param seller  the seller of the product
     */
    public Product(double price, String title, String genre, String artist, String seller) {
        this.price = price;
        this.title = title;
        this.genre = genre;
        this.artist = artist;
        this.seller = seller;
    }

    // setters and getters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

}


    // to string method for all products
    // preview, few pages, low qual image,
