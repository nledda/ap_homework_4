public class Milk extends PopularGrocery {
    
    /**
     * Constructor for Milk
     * @param quantity the quantity of milk
     * @param discountThreshold the discount threshold for milk
     * @param popularityLevel the popularity level of milk
     */
    public Milk(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 20;
    }
    
    /**
     * Returns the bulk discount for milk
     * @return 12 if quantity is at least the discount threshold, 0 otherwise
     */
    @Override
    public int getBulkDiscount() {
        return quantity >= discountThreshold ? 12 : 0;
    }
}
