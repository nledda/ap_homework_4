public class DiscountDemo {
    public static void main(String[] args) {
        // Create a milk object with quantity 10, discount threshold 5, and popularity level 8
        Milk milk = new Milk(10, 5, 8);
        System.out.println("Milk bulk discount: " + milk.getBulkDiscount());
        System.out.println("Milk needs warning: " + milk.showWarning());
        
        // Create a flour object with quantity 16, discount threshold 10, and popularity level 6
        Flour flour = new Flour(16, 10, 6);
        System.out.println("Flour bulk discount: " + flour.getBulkDiscount());
        System.out.println("Flour needs warning: " + flour.showWarning());
        
        // Test with different quantities
        milk.setQuantity(4);
        System.out.println("Milk bulk discount with quantity 4: " + milk.getBulkDiscount());
        
        flour.setQuantity(9);
        System.out.println("Flour bulk discount with quantity 9: " + flour.getBulkDiscount());
    }
}
