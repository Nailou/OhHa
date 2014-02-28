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


public class ManatTest {
    
    Manat manat;
    
    public ManatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        manat = new Manat();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void konstruktoriAsettaaAlussaManatOikein() {
        manat.getManat();
        assertEquals(0, manat.getManat());
    }
    
    @Test
    public void konstruktoriAsettaaAlussaLandienMaaranOikein() {
        manat.getLandienLkm();
        assertEquals(0, manat.getLandienLkm());
    }
    
    @Test
    public void landitMuuttuuOikein() {
        manat.uusiLand(0);
        assertEquals(1, manat.getLandienLkm());
    }
    
    @Test
    public void manatMuuttuuOikeinKunYksiLandi() {
        manat.uusiLand(0);
        assertEquals(1, manat.getManat());
    }
    
    @Test
    public void manatPysyyNollassaKunOtetaanNegatiivisetLandit() {
        manat.landiPois(0);
        assertEquals(0, manat.getManat());
    }
    
    @Test
    public void landitVaheneeOikein() {
        manat.uusiLand(0);
        manat.uusiLand(0);
        manat.landiPois(0);
        assertEquals(1, manat.getManat());
    }
    
    @Test
    public void manatMuuttuuOikeinKunCradlePoydassa() {
        manat.uusiLand(0);
        manat.uusiLand(2);
        manat.cradlePoytaan(2);
        assertEquals(4, manat.getManat());
    }
    
    @Test
    public void manatMuuttuuOikeinKunTuplat() {
        manat.manatTuplana(0);
        manat.uusiLand(0);
        manat.uusiLand(3);
        assertEquals(4, manat.getManat());
    }
    
    @Test
    public void manatMuuttuuOikeinKunCradleJaTuplat() {
        manat.manatTuplana(0);
        manat.cradlePoytaan(0);
        manat.uusiLand(0);
        manat.uusiLand(0);
        manat.uusiLand(2);
        assertEquals(10, manat.getManat());
    }
}
