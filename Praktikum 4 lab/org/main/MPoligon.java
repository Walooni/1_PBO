package org.main;
import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        // persegi panjang
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());
        
        // Segitiga
        Segitiga Segitiga1 = new Segitiga(10.2,8);
        Segitiga1.printInfo();
        System.out.println("Luas Segitiga :"+Segitiga1.hitungLuas());

    }
}