public interface Switchable {
    /**
     * Turns on the device
     */
    void turnOn();
    
    /**
     * Turns off the device
     */
    void turnOff();
    
    /**
     * Checks if the device is on
     * @return true if the device is on, false otherwise
     */
    boolean isOn();
}
