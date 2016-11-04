/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import activitat2exercici2.Nif;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class JUnit_Test {
    
    public JUnit_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
    }
    //Test amb un DNI valid
    @Test
    public final void testnifvalid() {
        assertEquals( "Nif Vàlid", Nif.esValid("54165493X"));
    }
    //Test amb format incorrecte per mes de 9 caracters
    @Test
    public final void testnifinvalidmes9() {
        assertEquals( "Format Incorrecte", Nif.esValid("5416546938X"));
    }
    //Test amb format incorrecte per menys de 8 caracters
    @Test
    public final void testnifinvalidmes8() {
        assertEquals( "Format Incorrecte", Nif.esValid("545493X"));
    }
    //Formar incorrecte per 2 lletres
    @Test
    public final void testnifinvalid2lletres() {
        assertEquals( "Format Incorrecte", Nif.esValid("J4165493X"));
    }
    //Test amb lletra incorrecta, nif invalid
    @Test
    public final void testniflletrainvalida() {
        assertEquals( "Nif Invàlid", Nif.esValid("54165493A"));
    }
}
