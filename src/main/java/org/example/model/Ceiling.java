package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    public Ceiling(int height, PaintColor color) {
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
