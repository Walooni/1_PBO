public class MainGaris{
    public static void main(String[] args) {
        point t1, t2, t3, t4;
        garis g1,g2;

        t1 = new point(3, 3);
        t2 = new point(1, 4);
        t3 = new point(2, 4);
        t4 = new point(5,7);
        g1 = new garis(t1, t2);
        g2 = new garis(t3, t4);

        System.out.printf("Panjang g1: "+g1.getPanjang()+"\n");
        System.out.printf("Panjang g2: "+g2.getPanjang()+"\n");
        
        System.out.printf("Gradien g1: "+g1.getGradien()+"\n");
        System.out.printf("Gradien g2: "+g2.getGradien()+"\n");

        System.out.println(g1.isTegakLurus(g2));
    }
}