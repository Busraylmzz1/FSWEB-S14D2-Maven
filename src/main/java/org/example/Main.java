package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Lamp lamp= new Lamp(100, true, LampType.NEON);
        Celling celling= new Celling(30, PaintColor.WHİTE);
        Bed bed = new Bed("double", 2,2,2,2);
        Wall northWall= new Wall("north");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");
        Wall[] walls = new Wall[]{northWall,eastWall,southWall,westWall};
        Bedroom bedroom = new Bedroom( "bedroom1", northWall, eastWall, westWall, southWall,celling, bed,lamp, new Wardrobe(2, 3, 4), new Carpet(2,5,PaintColor.WHİTE));

       // bedroom.createBedroom; burdayımmmm
    }

}