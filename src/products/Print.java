package products;

public class Print extends Product {
    double length;
    double width;

    public Print(double price, String title, String genre, String artist, String seller, double length, double width) {
        super(price, title, genre, artist, seller);
        this.length = length;
        this.width = width;
    }

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
