
package azusa.azusamanager;

/**
 * Kuvaa käytössä olevan manan (resurssien) määrää
 *
 */

public class Manat {
    
    private int mana;
    private int landit;
    private boolean tuplamanat;
    private boolean cradle;
    
    public Manat() {
        /**
        * Käytettävissä oleva resurssi eli mana
        *
        */
        this.mana = 0;
        /**
        * Pöydässä olevien landien määrä (tuottavat resursseja eli manaa, normaalisti yksi land tuottaa yhtä manaa vuorossa)
        *
        */
        this.landit = 0;
        /**
        * Kertoo, tuottavatko manalähteet normaalisti vai kaksinkertaista määrää manaa
        *
        */
        this.tuplamanat = false;
        /**
        * Kertoo, onko Gaea's Gradle-niminen kortti pöydässä, tuottaa pöydässä olevien omien creatureiden verran manaa
        *
        */
        this.cradle = false;
    }
    
    public int getManat() {
        return this.mana;
    }
    
    public int getLandienLkm() {
        return this.landit;
    }
    
    
    /**
    * Lisää yhden land-kortin pöytään
    *
    */
    
    public void uusiLand(int creaturetPoydassa) {
        this.landit++;
        paivitaTilanne(creaturetPoydassa);
    }
    
    /**
    * Poistaa yhden land-kortin pöydästä
    *
    */
    
    public void landiPois(int creaturetPoydassa) {
        if (this.landit > 0) {
            this.landit--;
        }
        paivitaTilanne(creaturetPoydassa);
    }
    
    /**
    * Landit (ja Gradle) tuottavat kaksinkertaisen määrän manaa
    *
    */
    
    public void manatTuplana(int creaturetPoydassa) {
        this.tuplamanat = true;
        paivitaTilanne(creaturetPoydassa);
    }
    
    /**
    * Landit (ja Gradle) tuottavat normaalin määrän manaa
    *
    */
    
    public void tuplamanatPois(int creaturetPoydassa) {
        this.tuplamanat = false;
        paivitaTilanne(creaturetPoydassa);
    }
    
    /**
    * Gaea's Gradle-niminen kortti tulee pöytään, tuottaa pöydässä olevien omien creatureiden verran manaa
    *
    */
    
    public void cradlePoytaan(int creaturetPoydassa) {
        this.cradle =  true;
        paivitaTilanne(creaturetPoydassa);
    }
    
    /**
    * Ottaa Gradlen pois pöydästä
    *
    */
    
    public void cradlePois(int creaturetPoydassa) {
        this.cradle = false;
        paivitaTilanne(creaturetPoydassa);
    }
    
    /**
    * Laskee uuden tuotettavissa olevan manan maksimimäärän
    *
    */
    
    public void paivitaTilanne(int creaturetPoydassa) {
        if (this.tuplamanat&&this.cradle) {
            this.mana = (creaturetPoydassa + this.landit) * 2;
        } else if (this.tuplamanat&&!this.cradle) {
            this.mana = this.landit * 2;
        }else if (!this.tuplamanat&&this.cradle) {
            this.mana = this.landit + creaturetPoydassa;
        } else if (!this.tuplamanat&&!this.cradle) {
            this.mana = this.landit;
        }
    }
}
