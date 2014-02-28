/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kayttoliittyma;

import azusa.azusamanager.Pelipoyta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

/**
 *
 * @author Niilo
 */
public class GradleKuuntelija implements ActionListener {
    
    private JCheckBox box;
    private Pelipoyta poyta;
    private JTextArea kohdeManat;
    
    public GradleKuuntelija (JCheckBox laatikko, Pelipoyta poyta, JTextArea kohdeManat) {
        this.box = laatikko;
        this.poyta = poyta;
        this.kohdeManat = kohdeManat;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if (this.box.isSelected()) {
            poyta.gradlePoytaan();
            kohdeManat.setText(Integer.toString(this.poyta.getManat()));
        } else {
            poyta.gradlePois();
            kohdeManat.setText(Integer.toString(this.poyta.getManat()));
        }
    }
}
