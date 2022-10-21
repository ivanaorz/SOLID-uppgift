import java.util.ArrayList;

abstract class Vehicle {
   private String typeOfTruck;
    private int weight;
    private String parkedTruck;


    public Vehicle (String typeOfTruck, int weight, String parkedTruck) {
        this.typeOfTruck = typeOfTruck;
        this.weight = weight;
        this.parkedTruck = parkedTruck;
    }
    public String getTypeOfTruck()
    {
        return typeOfTruck;
    }

    public void setTypeOfTruck(String typeOfTruck)
    {
        this.typeOfTruck = typeOfTruck;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getParkedTruck() {
        return parkedTruck;
    }
    public void setParkedTruck(String parkedTruck) {
        this.parkedTruck = parkedTruck;
    }



    public void park() {
        if((getWeight() < 4500) && (getTypeOfTruck().equalsIgnoreCase("van")) {
            void parkOnA(); }
        else if (\\ birth A is occupied) {
            void parkOnB();}
        else {
            System.out.println("Sorry, we are full.");
        }

        if((getWeight() > 5000) && (getTypeOfTruck().equalsIgnoreCase("small truck")) {
            void parkOnC(); }
        else if (\\ birth C is occupied) {
            void parkOnD();}
        else {
            System.out.println("Sorry, we are full.");
        }

        if((getWeight() < 5000) && (getTypeOfTruck().equalsIgnoreCase("small truck")) {
            void parkOnA(); }
        else if (\\ birth A is occupied) {
            System.out.println("Sorry, we are full.");
        }


        if((getWeight() > 9000) && (getTypeOfTruck().equalsIgnoreCase("heavy truck")) {
            void parkOnE(); }
        else if (\\ birth E is occupied) {
            System.out.println("Sorry, we are full.");
        }

        if((getWeight() < 9000) && (getTypeOfTruck().equalsIgnoreCase("heavy truck")) {
            void parkOnD(); }
        else if (\\ birth D is occupied) {
            System.out.println("Sorry, we are full.");
        }
    }

}
