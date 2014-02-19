/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package azusa.azusamanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author Niilo
 */
public class LandiPlusKuuntelija implements ActionListener {
    
    private Pelipoyta poyta;
    private JTextArea kohdeLandit;
    private JTextArea kohdeManat;
    
    public LandiPlusKuuntelija (Pelipoyta poyta, JTextArea kohdeLandit, JTextArea kohdeManat) {
        this.poyta = poyta;
        this.kohdeLandit = kohdeLandit;
        this.kohdeManat = kohdeManat;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.poyta.landitPlussaa();
        this.kohdeLandit.setText(Integer.toString(this.poyta.getLandit())); 
        this.kohdeManat.setText(Integer.toString(this.poyta.getManat()));
    }
}
