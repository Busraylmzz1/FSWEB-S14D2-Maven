package org.example.model;

public class Celling {
    private int height;
    private PaintColor color;

    public Celling(int height, PaintColor color) {
        this.height= height;
        this.color= color;
    }
    public void create() {
        System.out.println("Celling has been built.");
    }
    public int getHeight(){
        return height;
    }
    public PaintColor getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Celling{" +
                "height=" + height +
                ", color=" + color +
                '}';
    }
}
