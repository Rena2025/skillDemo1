import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class skillDemo1Tester {
    @Test 
    public void testmultiply() {
        assertEquals("should return 4 * 5 = 20", 20, 
            skillDemo1.multiply(4,5));
    }
}
