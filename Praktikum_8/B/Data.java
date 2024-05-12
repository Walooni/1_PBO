package B;
/*
 * Nama : Yahya Ilham Riyadi
 * NIM : 24060122130069
 * Lab : D1
*/
// Tugas 11b. generik.alg

public class Data<T> {
    private T isi;
    
    public T getIsi(){
        return this.isi;
    } 

    public void setIsi(T x){
        this.isi = x;
    }
}
