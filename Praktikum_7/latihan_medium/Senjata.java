package latihan_medium;

/**
 * Senjata
 */
class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    Senjata(String bunyi){
        this.peluru = 0;
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    public String getBunyi(){
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public boolean isMenusuk(){
        return this.menusuk;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
}