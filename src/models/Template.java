package models;

import interfaces.Discountable;

public class Template extends Product implements Discountable {
    // a template like for CV, for canva, powerpoint, etc. Those are the mediums
    private String medium;

    /** The discount percentage (0–100). Zero means no discount. */
    private double discountPercent = 0;

    /**
     *
     * @param price  price of the template
     * @param title  title/name of the template
     * @param genre  style/genre of the template
     * @param artist  artist of the template
     * @param seller  seller of the template
     * @param medium  medium of the template
     */
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

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public double getDiscountedPrice() {
        return price - (price * discountPercent / 100);
    }

}
