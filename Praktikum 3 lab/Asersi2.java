class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 7;
        assert(jariJari>0): "jari-jari tidak boleh nol atau negatif";//perubahan
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

/*secara konsep, fungsi asersi di sini mengecek agar jari-jari bernilai positif. namun pesan yang dikeluarkan
 * cenderung hanya melarang penggunaan jari-jari 0. seharusnya jari-jari tidak boleh 0 maupun negatif.
 * selain itu, seharusnya untuk menge-set jari-jari diperlukan suatu method khusus seperti setJariJari supaya variabel
 * tersebut tidak diakses secara langsung oleh class lain 
*/

// $ git config --global user.name "John Doe"
// $ git config --global user.email johndoe@example.com