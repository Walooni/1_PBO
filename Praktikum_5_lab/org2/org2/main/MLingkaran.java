


package main;
import BangunDatar.Lingkaran;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        //proses mengambil input dari user
        Scanner scan = new Scanner(System.in); //membuat objek scan yang merupakan instansiasi dari class Scanner dengan argumen System.in
        System.out.print("Masukkan jejari: "); 
        double jejari = scan.nextDouble();//memasukkan hasil scan input user ke dalam variabel jejari
        //algoritma
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}