
package azusa.azusamanager;


/**
 * Kuvaa elämäpisteiden määrää
 *
 */

public class Lifet {
    
    private int life;
    
    public Lifet () {
        /**
        * Omat elämäpisteet, alussa 40
        *
        */
        this.life = 40;
    }
    
    public int getLife() {
        return this.life;
    }
    
    /**
    * Kasvattaa elämäpisteiden määrää yhdellä
    *
    */
    
    public void plussaa() {
        this.life++;
    }
    
    /**
    * Vähentää elämäpisteiden määrää yhdellä
    *
    */
    
    public void miinusta() {
        this.life--;
    }
    
    public void setLife(int uusiLife) {
        this.life = uusiLife;
    }
}
