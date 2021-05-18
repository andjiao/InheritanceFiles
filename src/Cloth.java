
public abstract class Cloth {

    /*Exercsie 2
    Write a program that exemplifies the concept of inheritance.
    Comment the program accordingly to describe your example*/

    //Attributes gøres private, da vi ikke ønkser at andre skal have adgang og kunne ændre navnet på disse attributer
    private String mærke;
    private int size;



    // Making Constructor, has to have the same name as the class and the paramter should contain attributes
    public Cloth(String mærke, int size) {
        this.mærke = mærke;
        this.size = size;

    }

    //Da attributerne er private, er det nødvednigt med en getter for at kunne bruge attributerne i andre klasser
    public String getMærke(){ // public betyder at andre klasser nu kan tilgå attributerne

        return this.mærke;
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString(){
        return "Mærke:" + this.mærke +  "Størrelse:" + this.size;
    }
}
