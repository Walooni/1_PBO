package A;
/*
 * Nama : Yahya Ilham Riyadi
 * NIM : 24060122130069
 * Lab : D1
*/
// Tugas 11a. generik.alg

public class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
        // System.out.println("isi telah diganti dengan" + x);
    }
}