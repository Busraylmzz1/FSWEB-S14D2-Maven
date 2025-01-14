package org.example.model;

public class Lamp {
    private  LampType style;
    private boolean battery;
    private int globRating;


    public Lamp(int globRating, boolean battery, LampType style) {
        this.style= style;
        this.globRating= globRating;
        this.battery= battery;

    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
    public LampType getStyle() {
        return style;
    }
    public int getGlobRating(){
        return globRating;
    }
    public boolean isBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", globRating=" + globRating +
                ", battery=" + battery +
                '}';
    }
}
