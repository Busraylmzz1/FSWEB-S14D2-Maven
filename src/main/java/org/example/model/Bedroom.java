package org.example.model;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Celling celling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Celling celling, Bed bed,Lamp lamp,Wardrobe wardrobe, Carpet carpet ) {
        this.name= name;
        this.wall1= wall1;
        this.wall2= wall2;
        this.wall3= wall3;
        this.wall4= wall4;
        this.celling= celling;
        this.bed= bed;
        this.lamp= lamp;
        this.wardrobe= wardrobe;
        this.carpet= carpet;
    }
    public void create(){
        System.out.println("BAŞARDIMMM");
    }
    public String getName(){
        return name;
    }
    public Wall getWall1(){
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }
    public Wall getWall3() {
        return  wall3;
    }
    public Wall getWall4() {
        return wall4;
    }
    public Celling getCelling(){
        return celling;
    }
    public Bed getBed() {
        return bed;
    }
    public Lamp getLamp(){
        return lamp;
    }
    public Wardrobe getWardrobe() {
        return wardrobe;
    }
    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", celling=" + celling +
                ", bed=" + bed +
                ", lamp=" + lamp +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }
}
