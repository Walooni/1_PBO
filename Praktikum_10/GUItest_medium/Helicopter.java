public class Helicopter extends Vehicle {
    // ATRIBUT
    private double maxLoad;

    // METHOD
    public Helicopter(){
        this.maxLoad = 0;
    }

    public Helicopter (double maxLoad){
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString(){
        return super.toString() + " hanya memerlukan landasan kecil";
    }
}
