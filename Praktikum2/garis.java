
public class garis {
    private point tAwal;
    private point tAkhir;

    public garis(){
        point awal = new point();
        point akhir = new point();
        tAwal = awal;
        tAkhir = akhir;
    }

    garis(point Awal, point Akhir){
        this.tAwal = Awal;
        this.tAkhir = Akhir;
    }

    // garis(point awal, point akhir){
    //     this.tAwal = awal;
    //     this.tAkhir = akhir;
    // }

    public point getTAwal(){
        return this.tAwal;
    }
    
    public point getTAkhir(){
        return this.tAkhir;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow(tAwal.getAbsis() - tAwal.getAbsis(),2)+ Math.pow(tAkhir.getOrdinat() - tAwal.getOrdinat(),2));
    }

    public double getGradien(){
        return (tAkhir.getOrdinat() - tAwal.getOrdinat())/(tAkhir.getAbsis() - tAwal.getAbsis());   
    }
    
    public garis getRefleksiY(){
        garis hasil = new garis(tAwal.getRefleksiY(), tAkhir.getRefleksiY());
        return hasil;
    }

    public boolean isTegakLurus(garis g){
        return this.getGradien() * g.getGradien() ==-1;
    }


}
