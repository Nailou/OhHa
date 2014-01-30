/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package azusa.azusamanager;

/**
 *
 * @author Niilo
 */
public class Manat {
    
    private int mana;
    private int landit;
    private boolean tuplamanat;
    private boolean cradle;
    
    public Manat() {
        this.mana = 0;
        this.landit = 0;
        this.tuplamanat = false;
        this.cradle = false;
    }
    
    public int getManat() {
        return this.mana;
    }
    
    public int getLandienLkm() {
        return this.landit;
    }
    
    public void uusiLand(int creaturetPoydassa) {
        this.landit++;
        paivitaTilanne(creaturetPoydassa);
    }
    
    public void manatTuplana(int creaturetPoydassa) {
        this.tuplamanat = true;
        paivitaTilanne(creaturetPoydassa);
    }
    
    public void tuplamanatPois() {
        this.tuplamanat = false;
        
    }
    
    public void cradlePoytaan(int creaturetPoydassa) {
        this.cradle =  true;
        paivitaTilanne(creaturetPoydassa);
    }
    
    public void cradlePois(int creaturetPoydassa) {
        this.cradle = false;
        paivitaTilanne(creaturetPoydassa);
    }
    
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
