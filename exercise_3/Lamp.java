public class Lamp implements Switchable, Dimmable {
    private boolean on;
    private int brightness;
    
    /**
     * Constructor initializes lamp to off with brightness 0
     */
    public Lamp() {
        this.on = false;
        this.brightness = 0;
    }
    
    @Override
    public void turnOn() {
        this.on = true;
    }
    
    @Override
    public void turnOff() {
        this.on = false;
    }
    
    @Override
    public boolean isOn() {
        return this.on;
    }
    
    @Override
    public void setBrightness(int level) {
        // Only change brightness if the lamp is on
        if (this.on) {
            // Ensure brightness is between 0 and MAX_BRIGHTNESS
            if (level < 0) {
                this.brightness = 0;
            } else if (level > MAX_BRIGHTNESS) {
                this.brightness = MAX_BRIGHTNESS;
            } else {
                this.brightness = level;
            }
        }
    }
    
    @Override
    public int getBrightness() {
        return this.brightness;
    }
}
