/**
 * mTitik
 */
public class mTitik {

    public static void main(String[] args) {
        titik T1 = new titik();
        titik T2 = new titik();
        titik T3 = new titik(5, 6);

        T1.setAbsis(1);
        T1.setOrdinat(2);
        T2.setAbsis(3);
        T2.setOrdinat(4);

        System.out.println("t1("+T1.getAbsis()+", "+T1.getOrdinat()+")");
        System.out.println("t2("+T2.getAbsis()+", "+T2.getOrdinat()+")");
        System.out.println("t3("+T3.getAbsis()+", "+T3.getOrdinat()+")");
        System.out.println("jumlah objek titik: "+titik.getCounter());



        // System.out.println("absis titik 1: "+T1.getAbsis());
        // System.out.println("ordinat titik 1: "+T1.getOrdinat());
        // System.out.println("absis titik 2: "+T2.getAbsis());
        // System.out.println("ordinat titik 2: "+T2.getOrdinat());


    }
}