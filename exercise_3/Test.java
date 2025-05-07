public class LampDemo {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        
        // Initial state
        System.out.println("Initial state:");
        System.out.println("Lamp is on: " + lamp.isOn());
        System.out.println("Brightness: " + lamp.getBrightness());
        
        // Turn on the lamp
        lamp.turnOn();
        System.out.println("\nAfter turning on:");
        System.out.println("Lamp is on: " + lamp.isOn());
        
        // Set brightness to 80
        lamp.setBrightness(80);
        System.out.println("After setting brightness to 80: " + lamp.getBrightness());
        
        // Dim to half
        lamp.dimToHalf();
        System.out.println("After dimming to half: " + lamp.getBrightness());
        
        // Test setting brightness when lamp is off
        lamp.turnOff();
        lamp.setBrightness(100);
        System.out.println("\nAfter turning off and trying to set brightness to 100:");
        System.out.println("Lamp is on: " + lamp.isOn());
        System.out.println("Brightness: " + lamp.getBrightness());
        
        // Turn back on
        lamp.turnOn();
        System.out.println("\nAfter turning back on:");
        System.out.println("Lamp is on: " + lamp.isOn());
        System.out.println("Brightness: " + lamp.getBrightness());
    }
}
