
package azusa.azusamanager;

/**
 * Yhdistää elämäpisteiden ja manan hallinnan, sekä kertoo pöytätilanteen korttien osalta (ja todennäköisyyden yhden tietyn kortin nostamiselle)
 *
 */


public class Pelipoyta {
    
    private Lifet lifet;
    private Manat manat;
    private int muutKortitPoydassa;
    private int kortitKadessa;
    private int kortitGravessa;
    private int creaturetPoydassa;
    
    public Pelipoyta() {
        this.kortitKadessa = 0;
        this.muutKortitPoydassa = 0;
        this.kortitGravessa = 0;
        this.creaturetPoydassa = 0;
        this.lifet = new Lifet();
        this.manat = new Manat();
    }

    public int getLifet() {
        return this.lifet.getLife();
    }
    
    public void lifePlussaa() {
        this.lifet.plussaa();
    }
    
    public void lifeMiinusta() {
        this.lifet.miinusta();
    }

    public int getManat() {
        return manat.getManat();
    }
    
    public int getLandit() {
        return this.manat.getLandienLkm();
    }
    
    public void landitPlussaa() {
        this.manat.uusiLand(muutKortitPoydassa);
    }
    
    public void tuplaManat() {
        this.manat.manatTuplana(creaturetPoydassa);
    }
    
    public void tuplaManatPois() {
        this.manat.tuplamanatPois(creaturetPoydassa);
    }
    
    public void gradlePoytaan() {
        this.manat.cradlePoytaan(creaturetPoydassa);
    }
    
    public void gradlePois() {
        this.manat.cradlePois(creaturetPoydassa);
    }

    public int getKortitGravessa() {
        return kortitGravessa;
    }

    public int getMuutKortitPoydassa() {
        return this.muutKortitPoydassa;
    }
    
    public int getKaikkiKortitPoydassa() {
        return (this.creaturetPoydassa + this.muutKortitPoydassa);
    }
    
    public int getKasikortit() {
        return this.kortitKadessa;
    }
    
    public void uusiKasikortti() {
        this.kortitKadessa++;
    }
    
    public void uusiKorttiPoytaan() {
        this.muutKortitPoydassa++;
    }
    
    public void uusiKorttiGravelle() {
        this.kortitGravessa++;
    }
    
    public void uusiCreaturePoytaan() {
        this.creaturetPoydassa++;
    }
    
    public void creaturePoisPoydasta() {
        if (this.creaturetPoydassa > 0) {
            this.creaturetPoydassa--;
        }
    }
    
    public int getCreaturetPoydassa() {
        return this.creaturetPoydassa;
    }
    
}
