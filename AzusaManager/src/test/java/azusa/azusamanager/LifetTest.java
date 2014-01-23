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
public class LifetTest {
    
    Lifet life;
    
    public LifetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        life = new Lifet();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {}
    
    @Test
    public void konstruktoriAsettaaLifetOikein() {
        life.getLife();
        assertEquals(40, life.getLife());
    }
    
    @Test
    public void lifetMuuttuuOikein() {
        life.setLife(25);
        assertEquals(25, life.getLife());
    }
    
    @Test
    public void plussaaOikein() {
        life.plussaa();
        assertEquals(41, life.getLife());
    }
    
    @Test
    public void miinustaOikein() {
        life.miinusta();
        assertEquals(39, life.getLife());
    }
    
}
