public class Flour extends PopularGrocery {
    
    /**
     * Constructor for Flour
     * @param quantity the quantity of flour
     * @param discountThreshold the discount threshold for flour
     * @param popularityLevel the popularity level of flour
     */
    public Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 15;
    }
    
    /**
     * Returns the bulk discount for flour
     * @return 5 if quantity is at least the discount threshold, 0 otherwise
     */
    @Override
    public int getBulkDiscount() {
        return quantity >= discountThreshold ? 5 : 0;
    }
}
