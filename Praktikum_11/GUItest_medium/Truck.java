public class Truck extends Vehicle {
    // ATRIBUT
    private double maxLoad;

    // METHOD
    public Truck(){
        this.maxLoad = 0;
    }

    public Truck (double maxLoad){
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString(){
        return super.toString() + " adalah angkutan darat yang sangat handal";
    }
}
