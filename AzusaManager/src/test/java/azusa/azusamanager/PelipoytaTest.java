/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package azusa.azusamanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Niilo
 */
public class PelipoytaTest {
    
    Pelipoyta poyta;
    
    public PelipoytaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        poyta = new Pelipoyta();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void konstruktoriAsettaaLifetOikein() {
        poyta.getLifet();
        assertEquals(40, poyta.getLifet());
    }
    
    @Test
    public void konstruktoriAsettaaLanditOikein() {
        poyta.getLandit();
        assertEquals(0, poyta.getLandit());
    }
    
    @Test
    public void konstruktoriAsettaaManatOikein() {
        poyta.getManat();
        assertEquals(0, poyta.getManat());
    }
    
    @Test
    public void konstruktoriAsettaaKasikortitOikein() {
        poyta.getKasikortit();
        assertEquals(0, poyta.getKasikortit());
    }
    
    @Test
    public void kasikortitKasvaaOikein() {
        poyta.uusiKasikortti();
        assertEquals(1, poyta.getKasikortit());
    }
    
    @Test
    public void konstruktoriAsettaaCreaturetOikein() {
        poyta.getCreaturetPoydassa();
        assertEquals(0, poyta.getCreaturetPoydassa());
    }
    
    @Test
    public void creatureidenMaaraKasvaaOikein() {
        poyta.uusiCreaturePoytaan();
        poyta.uusiCreaturePoytaan();
        assertEquals(2, poyta.getCreaturetPoydassa());
    }
    
    @Test
    public void creaturetEiMeneNegatiiviseksi() {
        poyta.creaturePoisPoydasta();
        poyta.creaturePoisPoydasta();
        assertEquals(0, poyta.getCreaturetPoydassa());
    }
    
    @Test
    public void konstruktoriAsettaaGravenOikein() {
        poyta.getKortitGravessa();
        assertEquals(0, poyta.getKortitGravessa());
    }
    
    @Test
    public void graveKasvaaOikein() {
        poyta.uusiKorttiGravelle();
        assertEquals(1, poyta.getKortitGravessa());
    }
}
