package A;
/*
 * Nama : Yahya Ilham Riyadi
 * NIM : 24060122130069
 * Lab : D1
*/
// Tugas 11a. generik.alg

public class Main {
    public static void main(String[] args) {
        // kamus
        // Ulat K;
        // Data<Kupu> anu;

        // Algoritma
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}
