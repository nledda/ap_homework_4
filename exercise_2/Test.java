public class Test {
    public static void main(String[] args) {
        // Example showing difference between == and equals()
        String str1 = "hello";
        String str2 = new String("hello");
        
        System.out.println("Using == operator: " + (str1 == str2));
        System.out.println("Using equals() method: " + str1.equals(str2));
        
        // Example from the homework
        String string1 = "abc";
        String string2 = "abc";
        System.out.println("\nString literals comparison:");
        System.out.println("string1 == string2: " + (string1 == string2)); // true
        
        // Example with new String
        String string3 = new String("abc");
        System.out.println("\nString object comparison:");
        System.out.println("string1 == string3 (new String): " + (string1 == string3)); // false
        System.out.println("string1.equals(string3): " + string1.equals(string3)); // true
    }
}
