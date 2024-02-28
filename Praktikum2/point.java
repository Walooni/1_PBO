
public class point {
    //atribut
    private double x,y;

    //Konstruktor
    // konstruktor gak perlu pake visibility
    public point(){
        this.x = 0;
        this.y = 0;
    }

    public point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Setter
    public void setAbsis(double x){
        this.x = x;
    }

    public void setOrdinat(double y){
        this.y = y;
    }

    //Getter
    public double getAbsis(){
        return this.x;
    }

    public double getOrdinat(){
        return this.y;
    }

    // prosedur tambahan untuk mempermudah print
    public void printPoint(){
        System.out.println("titik: ("+ this.getAbsis() + ", " + this.getOrdinat()+")");
    }

    //Method untuk soal
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.getAbsis(), 2)+Math.pow(this.getOrdinat(), 2)) ;
    }

    public void refleksiX(){
        this.setOrdinat(-y);
    }
    
    public void refleksiY(){
        this.setAbsis(-x);
    }

    public point getRefleksiX(){
        point temp = new point((this.x),(this.y)*(-1));
        return temp;
    }
    
    public point getRefleksiY(){
        point temp = new point((this.x)*(-1),(this.y));
        return temp;
    }



    //Main Program

}