package org.example.model;


public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Celling celling;

    private Lamp lamp;
    private Carpet carpet;

    public Bedroom( Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                    Celling celling,Lamp lamp,Carpet carpet,
                    String name, Bed bed, Wardrobe wardrobe ) {
        super(wall1,wall2,wall3,wall4,celling,lamp,carpet);
        this.name=name;
        this.bed= bed;
        this.wardrobe= wardrobe;




    }
    public void createBedroom(){
       getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();

    }




    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +

                ", bed=" + bed +

                ", wardrobe=" + wardrobe +
                ", room=" + super.toString()+

                '}';
    }
}
