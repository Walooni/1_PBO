package latihan_medium;

public class KontrolSenjata {
    Senjata senjata;

    KontrolSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    public boolean isAdaPeluru(){
        int peluruSenjata = this.senjata.getPeluru();
        return (peluruSenjata >= 0);
    }

    public void isiPeluru(int jumPeluru){
        System.out.println(">> peluru berhasil ditambah: "+jumPeluru);
        int peluruAwal = this.senjata.getPeluru();
        this.senjata.setPeluru(jumPeluru+peluruAwal);
    }

    public void menembak(int jumlah){
        System.out.println(">> siap menembak "+jumlah+" kali");

        if (this.senjata.getPeluru() == 0){
            System.out.println("Peluru habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                int jml_peluru = this.senjata.getPeluru();
                if (jml_peluru > 0) {
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(jml_peluru-1);
                } else {
                    System.out.println("gagal tembak, peluru habis");
                }
            }
            System.out.println(">> Peluru sisa: " + this.senjata.getPeluru());
        }
    }
}
