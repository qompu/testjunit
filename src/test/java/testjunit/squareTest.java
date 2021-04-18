
package testjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author qompu
 */
public class squareTest {
    
    public squareTest() {
        
    }

    /**
     * Test of area method, of class square.
     */
    @Test
    public void testArea() {
        
            square s = new square(2);
            double expected = 4;
            double actual = s.area();
            double delta = 0.0001; // precision used for comparing doubles
            assertEquals(expected, actual, delta);
            //for more assert class options see junit javadoc at sourceforge: 
            //http://junit.sourceforge.net/javadoc/org/junit/Assert.html
            
    }

    /**
     * Test of setSideLength method, of class square.
     */
    @Test
    public void testSetSideLength() {
    }
    
}
