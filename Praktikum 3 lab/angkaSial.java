public class angkaSial {
    public void cobaAngka(int num) throws angkaSialException{
        if (num == 13) {
            throw new angkaSialException();
        }
        System.out.println(num + " bukan angka sial");
    }

    public static void main(String[] args) {
        angkaSial as = new angkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (angkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }

// Jawaban Pertanyaan
/*
 * 1. Ketika eksepsi terjadi, baris 12 (pada code ini baris ke 6) pada angkaSial.java di atas dieksekusi sekali lalu tidak dieksekusi lagi karena terjadi eksepsi saat method cobaAngka(13) dijalankan
 * 2. baris 21 (pada code ini baris 15) dieksekusi karena terdeteksi sebuah exception ==> angkaSialException saat method cobaAngka(13) dieksekusi. 
*/
}
