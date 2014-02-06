/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package azusa.azusamanager;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 * Ohjelman graafinen käyttöliittymä, ensimmäinen hahmotelma
 *
 */
public class Kayttoliittyma implements Runnable {
    
    private JFrame frame;

    public Kayttoliittyma() {
    }

    @Override
    public void run() {
        frame = new JFrame("Otsikko");
        frame.setPreferredSize(new Dimension(500, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3, 4);
        container.setLayout(layout);
        JTextArea Lifet = new JTextArea("Lifet");
        JTextArea LifetNumeroina = new JTextArea();
        JButton lifetPlussaa = new JButton("+");
        JButton lifetMiinusta = new JButton("-");
        
        JTextArea Landit = new JTextArea("Landit");
        JTextArea landitNumeroina = new JTextArea();
        JTextArea Manat = new JTextArea("Manat");
        JTextArea ManatNumeroina = new JTextArea();
        JButton landitPlussaa = new JButton("+");
        JButton landitMiinusta = new JButton("-");
        JCheckBox gradle = new JCheckBox("Gradle");
        JCheckBox tuplat = new JCheckBox("Tuplamanat");
        
        container.add(Lifet);
        container.add(lifetMiinusta);
        container.add(lifetPlussaa);
        container.add(LifetNumeroina);
        
        container.add(Landit);
        container.add(landitMiinusta);
        container.add(landitPlussaa);
        container.add(landitNumeroina);
        container.add(gradle);
        container.add(tuplat);
        container.add(Manat);
        container.add(ManatNumeroina);
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
