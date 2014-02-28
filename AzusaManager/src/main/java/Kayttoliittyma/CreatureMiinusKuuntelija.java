

package Kayttoliittyma;

import azusa.azusamanager.Pelipoyta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author Niilo
 */
public class CreatureMiinusKuuntelija implements ActionListener {
    
    private Pelipoyta poyta;
    private JTextArea creatureKentta;
    private JTextArea kohdeManat;
    
    public CreatureMiinusKuuntelija (Pelipoyta poyta, JTextArea kentta, JTextArea kohdeManat) {
        this.poyta = poyta;
        this.creatureKentta = kentta;
        this.kohdeManat = kohdeManat;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.poyta.creaturePoisPoydasta();
        this.creatureKentta.setText(Integer.toString(this.poyta.getCreaturetPoydassa())); 
        this.kohdeManat.setText(Integer.toString(this.poyta.getManat()));
    }
    
}
