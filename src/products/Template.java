package products;

public class Template extends Product {
    String medium;

    // constructor
    public Template(double price, String title, String genre, String artist, String seller, String medium) {
        super(price, title, genre, artist, seller);
        this.medium = medium;
    }

    // setters and getters
    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
