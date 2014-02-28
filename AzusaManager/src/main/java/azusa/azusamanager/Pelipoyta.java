
package azusa.azusamanager;

/**
 * Yhdistää elämäpisteiden ja manan hallinnan, sekä kertoo pöytätilanteen korttien osalta (ja todennäköisyyden yhden tietyn kortin nostamiselle)
 *
 */


public class Pelipoyta {
    
    private Lifet lifet;
    private Manat manat;
    private int creaturetPoydassa;
    
    public Pelipoyta() {
        /**
        * Pöydässä olevien hirviöiden eli creatureiden lukumäärä
        *
        */
        this.creaturetPoydassa = 0;
        /**
        * Elämäpisteiden määrä
        *
        */
        this.lifet = new Lifet();
        /**
        * PKäytettävissä olevan resurssin, eli manan määrä
        *
        */
        this.manat = new Manat();
    }

    public int getLifet() {
        return this.lifet.getLife();
    }
    
    /**
    * Kasvattaa elämäpisteiden määrää yhdellä
    *
    */
    
    public void lifePlussaa() {
        this.lifet.plussaa();
    }
    
    /**
    * Vähentää elämäpisteiden määrää yhdellä
    *
    */
    
    public void lifeMiinusta() {
        this.lifet.miinusta();
    }

    public int getManat() {
        return manat.getManat();
    }
    
    public int getLandit() {
        return this.manat.getLandienLkm();
    }
    
    /**
    * Kasvattaa landien määrää yhdellä
    *
    */
    
    public void landitPlussaa() {
        this.manat.uusiLand(creaturetPoydassa);
    }
    
    public void landitMiinusta() {
        this.manat.landiPois(creaturetPoydassa);
    }
    
    /**
    * Landit (ja Gradle) tuottavat kaksinkertaisen määrän manaa
    *
    */
    
    public void tuplaManat() {
        this.manat.manatTuplana(creaturetPoydassa);
    }
    
    /**
    * Landit (ja Gradle) tuottavat normaalin määrän manaa
    *
    */
    
    public void tuplaManatPois() {
        this.manat.tuplamanatPois(creaturetPoydassa);
    }
    
    /**
    * Gaea's Gradle-niminen kortti tulee pöytään, tuottaa pöydässä olevien omien creatureiden verran manaa
    *
    */
    
    public void gradlePoytaan() {
        this.manat.cradlePoytaan(creaturetPoydassa);
    }
    
    /**
    * Ottaa Gradlen pois pöydästä
    *
    */
    
    public void gradlePois() {
        this.manat.cradlePois(creaturetPoydassa);
    }   
    
    /**
    * Lisää uuden creaturen pöytään
    *
    */
    
    public void uusiCreaturePoytaan() {
        this.creaturetPoydassa++;
        this.manat.paivitaTilanne(creaturetPoydassa);
    }
    
    /**
    * Ottaa yhden creaturen pöydästä pois pöydästä
    *
    */
    
    public void creaturePoisPoydasta() {
        if (this.creaturetPoydassa > 0) {
            this.creaturetPoydassa--;
            this.manat.paivitaTilanne(creaturetPoydassa);
        }
    }
    
    public int getCreaturetPoydassa() {
        return this.creaturetPoydassa;
    }
    
}
