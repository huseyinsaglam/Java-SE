package hafizaOyunu;


import java.io.Serializable;


public class Kart{
    
    private char deger; // kartin degerini tutmasini saglayacak...
    private boolean tahmin = false; // kartin tahmin degerini tutmasini saglayacak...

    public Kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
    
    
    
    
}
