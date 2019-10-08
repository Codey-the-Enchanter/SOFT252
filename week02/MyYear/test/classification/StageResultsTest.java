/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mburren
 */
public class StageResultsTest {
    private StageResults empty;
    private StageResults full;
    private StageResults halfFull;
    
    public StageResultsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        empty = new StageResults();
        
        full = new StageResults();
        full.addModuleMark(120, 50.0);
        
        halfFull = new StageResults(); 
        halfFull.addModuleMark(60, 50.0); 
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStage2Average() {
    }

    @Test
    public void testGetTotalCredits() {
    }

    @Test
    public void testGetTotalMarks() {
    }

    @Test
    public void testSetStage2Average() {
    }

    @Test
    public void testIsComplete() {
        System.out.println("testing IsComplete");
        
        assertFalse("Empty object", empty.isComplete());
        assertTrue("Full object", full.isComplete());
        assertFalse("Half full object", halfFull.isComplete());
    }

    @Test
    public void testResetValues() {
        System.out.println("Testing resetValues");

        // Set the state of the 'full' object to zeroes
        full.resetValues();

        // Set expected results
        int expIntResult = 0;
        double expDoubleResult = 0.0;

        // Now check each attribute to test that the reset has worked
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);

        // Put the 'full' object back to its original state
        full.addModuleMark(120, 50.0); 
    }

    @Test
    public void testAddModuleMark() {
        System.out.println("Testing addModuleMark");
        
        empty.addModuleMark(20, 40);
        
        assertEquals("credits", 20.0, empty.getTotalCredits(), 0.0);
        
        assertEquals("marks", 80, empty.getTotalMarks(), 0.0);
        
        empty.resetValues();
    }

    @Test
    public void testCalculateAverageSoFar() {
        fail("test is not yet implemented");
    }

    @Test
    public void testPredictClass() {
        fail("test is not yet implemented");
    }
    
}
