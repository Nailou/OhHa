
package Kayttoliittyma;

import azusa.azusamanager.Pelipoyta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author Niilo
 */
public class LandiMiinusKuuntelija implements ActionListener {
    
    private Pelipoyta poyta;
    private JTextArea kohdeLandit;
    private JTextArea kohdeManat;
    
    public LandiMiinusKuuntelija (Pelipoyta poyta, JTextArea kohdeLandit, JTextArea kohdeManat) {
        this.poyta = poyta;
        this.kohdeLandit = kohdeLandit;
        this.kohdeManat = kohdeManat;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.poyta.landitMiinusta();
        this.kohdeLandit.setText(Integer.toString(this.poyta.getLandit())); 
        this.kohdeManat.setText(Integer.toString(this.poyta.getManat()));
    }
}
