public class SeaPlane extends Vehicle{
    // ATRIBUT
    private double maxLoad;

    // METHOD
    public SeaPlane(){
        this.maxLoad = 0;
    }

    public SeaPlane (double maxLoad){
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString(){
        return super.toString() + " dapat take-off dan mendarat di perairan laut";
    }
}
