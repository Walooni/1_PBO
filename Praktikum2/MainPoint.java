public class MainPoint {


    public static void main(String args[]) {
        point t1 = new point();
        t1.setAbsis(3);
        t1.setOrdinat(4);
        System.out.println("Titik("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        //get jarak
        System.out.println(""+t1.getJarakPusat());

        //refleksi X
        t1.refleksiX();
        System.out.println("t1 setelah di refleksi thd sumbu x: "+"("+t1.getAbsis()+","+t1.getOrdinat()+")");
        //refleksi Y
        t1.refleksiY();
        System.out.println("t1 setelah di refleksi thd sumbu y: "+"("+t1.getAbsis()+","+t1.getOrdinat()+")");
        
        //getRefleksiX
        System.out.println("get titik refleksi X: ");
        t1.getRefleksiX().printPoint();
        
        //getRefleksiY
        System.out.println("get titik refleksi Y: ");
        t1.getRefleksiY().printPoint();


    }
}
