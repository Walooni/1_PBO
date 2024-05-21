package latihan_very_easy;

class Senjata {
    private String bunyi;
    private int peluru;
    
    Senjata(String bunyi){
        this.peluru = 0;
        this.bunyi = bunyi;
    }

    public String getBunyi(){
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }

    public void menembak(){
        System.out.println(this.getBunyi());
        this.setPeluru(this.getPeluru() - 1);
        System.out.println("Sisa peluru: " + this.getPeluru());
    }
    
}