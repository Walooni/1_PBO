package org.bangundatar;
import org.poligon.*;

public class Segitiga extends Poligon {
    private double alas, tinggi;
    // private int jumlahSisi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.setJumlahSisi(3);
    }

    public double hitungLuas(){
        return (alas * tinggi)/2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi());
    }
}
