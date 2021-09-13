/**
 * Description:
 * Author: Qi
 * Date: 09-13-2021
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Test001 {
    @Test
    public void testA() {
        assertEquals(3, FloorSquareRoot.floorSqrt(11));
    }

    @Test
    public void testB() {
        assertEquals(4, FloorSquareRoot.floorSqrt(20));
    }
}