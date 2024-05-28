import java.util.*;

public class ArmadaKendaraan <T extends Vehicle> {
    // ATRIBUT
    private Collection<T> armada;

    // KONSTRUKTOR
    // Konstruktor armada dengan inisialisasi list
    public ArmadaKendaraan(){
        this.armada = new ArrayList<>();
    }

    // METHOD
    // Prosedur untuk menambah kendaraan ke dalam armada dari 
    // list suatu jenis kendaraan yang sama
    public void tambahArmada(Collection<? extends T> armadaBaru){
        armada.addAll(armadaBaru);
    }

    // Fungsi untuk mengembalikan sebuah koleksi kendaraan berupa armada
    public Collection<T> getAllArmada(){
        return armada;
    }
}
