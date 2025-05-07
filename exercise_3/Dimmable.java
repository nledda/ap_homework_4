public interface Dimmable {
    /**
     * Constant for maximum brightness
     */
    int MAX_BRIGHTNESS = 100;
    
    /**
     * Sets the brightness level
     * @param level the brightness level to set, between 0 and MAX_BRIGHTNESS
     */
    void setBrightness(int level);
    
    /**
     * Gets the current brightness level
     * @return the current brightness level
     */
    int getBrightness();
    
    /**
     * Default method to dim to half brightness
     */
    default void dimToHalf() {
        setBrightness(MAX_BRIGHTNESS / 2);
    }
}
