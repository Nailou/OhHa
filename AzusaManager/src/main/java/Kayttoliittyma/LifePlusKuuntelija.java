/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kayttoliittyma;

import azusa.azusamanager.Pelipoyta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author Niilo
 */
public class LifePlusKuuntelija implements ActionListener {
    
    private Pelipoyta poyta;
    private JTextArea kohde;
    
    public LifePlusKuuntelija (Pelipoyta poyta, JTextArea kohde) {
        this.poyta = poyta;
        this.kohde = kohde;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.poyta.lifePlussaa();
        this.kohde.setText(Integer.toString(this.poyta.getLifet())); 
    }
}
