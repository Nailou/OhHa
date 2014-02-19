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
public class CreaturePlusKuuntelija implements ActionListener {
    
    private Pelipoyta poyta;
    private JTextArea creatureKentta;
    private JTextArea kohdeManat;
    
    public CreaturePlusKuuntelija (Pelipoyta poyta, JTextArea kentta, JTextArea kohdeManat) {
        this.poyta = poyta;
        this.creatureKentta = kentta;
        this.kohdeManat = kohdeManat;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.poyta.uusiCreaturePoytaan();
        this.creatureKentta.setText(Integer.toString(this.poyta.getCreaturetPoydassa())); 
        this.kohdeManat.setText(Integer.toString(this.poyta.getManat()));
    }
}
