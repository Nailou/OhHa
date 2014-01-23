
package azusa.azusamanager;


public class Lifet {
    
    private int life;
    
    public Lifet () {
        this.life = 40;
    }
    
    public int getLife() {
        return this.life;
    }
    
    public void plussaa() {
        this.life++;
    }
    
    public void miinusta() {
        this.life--;
    }
    
    public void setLife(int uusiLife) {
        this.life = uusiLife;
    }
}
