package interfaces;

/**
 * This interface is for products that support discount pricing
 */
public interface Discountable {
    /**
     * applies a discount on a product
     * @param percent the discount percentange (1-100)
     */
    void applyDiscount(double percent);

    /**
     * return the price of the product after the discount was applied
     * @return the discounted price
     */
    double getDiscountedPrice();

}
