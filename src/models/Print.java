package models;

public class Print extends Product {
    // a print is like a poster, so length and width must be defined
    private double length;
    private double width;

    /**
     *
     * @param price  price of the print
     * @param title  title of the print
     * @param genre  genre/style of the print
     * @param artist  artist of the print
     * @param seller  seller of the print
     * @param length  length of the print
     * @param width  width of the print
     */
    public Print(double price, String title, String genre, String artist, String seller, double length, double width) {
        super(price, title, genre, artist, seller);
        this.length = length;
        this.width = width;
    }

    // setter and getters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
