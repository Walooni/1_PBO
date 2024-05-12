package B;
/*
 * Nama : Yahya Ilham Riyadi
 * NIM : 24060122130069
 * Lab : D1
*/
// Tugas 11b. generik.alg

public class Main {
    public static void main(String[] args) {
        // kamus 
        // Ulat K;
        // Data<Kupu> anu;

        // Algoritma
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        
        // diisi Ulat
        anu.setIsi(K);
        anu.getIsi().gerak();

        // diisi kepompong
        anu.setIsi(new kepompong());
        anu.getIsi().gerak();

        // diisi Kupu Dewasa
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }    
}
