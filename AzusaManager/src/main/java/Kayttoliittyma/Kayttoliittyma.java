/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kayttoliittyma;

import azusa.azusamanager.Pelipoyta;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 * Ohjelman graafinen käyttöliittymä, ensimmäinen hahmotelma
 *
 */
public class Kayttoliittyma implements Runnable {
    
    private JFrame frame;
    private Pelipoyta poyta;

    public Kayttoliittyma(Pelipoyta poyta) {
        this.poyta = poyta;
    }

    @Override
    public void run() {
        frame = new JFrame("Azusa manager 2k");
        frame.setPreferredSize(new Dimension(500, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(4, 4);
        container.setLayout(layout);
        JLabel Lifet = new JLabel("Lifet");
        JTextArea LifetNumeroina = new JTextArea("40");
        
        JButton lifetPlussaa = new JButton("+");
        LifePlusKuuntelija lifePlussaaja = new LifePlusKuuntelija(poyta, LifetNumeroina);
        lifetPlussaa.addActionListener(lifePlussaaja);
        
        JButton lifetMiinusta = new JButton("-");
        LifeMiinusKuuntelija lifeMiinustaja = new  LifeMiinusKuuntelija(poyta, LifetNumeroina);
        lifetMiinusta.addActionListener(lifeMiinustaja);
        
        JLabel Landit = new JLabel("Landit");
        JTextArea landitNumeroina = new JTextArea("0");
        JLabel Manat = new JLabel("Manat");
        JTextArea ManatNumeroina = new JTextArea("0");
        
        JButton landitPlussaa = new JButton("+");
        LandiPlusKuuntelija landPlussaaja = new LandiPlusKuuntelija(poyta, landitNumeroina, ManatNumeroina);
        landitPlussaa.addActionListener(landPlussaaja);
        
        JButton landitMiinusta = new JButton("-");
        LandiMiinusKuuntelija landMiinustaja = new LandiMiinusKuuntelija(poyta, landitNumeroina, ManatNumeroina);
        landitMiinusta.addActionListener(landMiinustaja);
        
        JLabel creaturet = new JLabel ("Creaturet");
        JTextArea creaturetLkm = new JTextArea("0");
        
        JButton creaturetMiinusta = new JButton("-");
        CreatureMiinusKuuntelija creatureMiinusKuuntelija = new CreatureMiinusKuuntelija(poyta, creaturetLkm, ManatNumeroina);
        creaturetMiinusta.addActionListener(creatureMiinusKuuntelija);
        
        JButton creaturetPlussaa = new JButton("+");
        CreaturePlusKuuntelija creaturePlusKuuntelija = new CreaturePlusKuuntelija(poyta, creaturetLkm, ManatNumeroina);
        creaturetPlussaa.addActionListener(creaturePlusKuuntelija);
        
        JCheckBox gradle = new JCheckBox("Gradle");
        GradleKuuntelija gradleKuuntelija = new GradleKuuntelija(gradle, poyta, ManatNumeroina);
        gradle.addActionListener(gradleKuuntelija);
        
        JCheckBox tuplat = new JCheckBox("Tuplamanat");
        TuplamanaKuuntelija tuplaKuuntelija = new TuplamanaKuuntelija(tuplat, poyta, ManatNumeroina);
        tuplat.addActionListener(tuplaKuuntelija);
        
        container.add(Lifet);
        container.add(lifetMiinusta);
        container.add(lifetPlussaa);
        container.add(LifetNumeroina);
        
        container.add(Landit);
        container.add(landitMiinusta);
        container.add(landitPlussaa);
        container.add(landitNumeroina);
        container.add(creaturet);
        container.add(creaturetMiinusta);
        container.add(creaturetPlussaa);
        container.add(creaturetLkm);
        container.add(gradle);
        container.add(tuplat);
        container.add(Manat);
        container.add(ManatNumeroina);
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
