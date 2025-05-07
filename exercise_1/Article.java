public abstract class Article {
    protected int discountThreshold;
    protected int householdLimit;
    
    /**
     * Returns the bulk discount amount for this article
     * @return discount amount
     */
    public abstract int getBulkDiscount();
    
    /**
     * Returns whether a warning should be shown for this article
     * @return true if warning should be shown, false otherwise
     */
    public abstract boolean showWarning();
}
