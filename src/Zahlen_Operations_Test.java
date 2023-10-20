import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Zahlen_Operations_Test {

    @Test
    public void testMaxNRSuccess() {
        int[] zahlen = {12, 45, 67, 89, 23};
        int expected = 89;
        assertEquals(expected, Zahlen_Operations.maxNR(zahlen));
    }

    @Test
    public void testMinNRSuccess() {
        int[] zahlen = {12, 45, 67, 89, 23};
        int expected = 12;
        assertEquals(expected, Zahlen_Operations.minNR(zahlen));
    }

    @Test
    public void testMaxSumSuccess() {
        int[] noten = {85, 90, 78, 90, 92, 85};
        int expected = 442;
        assertEquals(expected, Zahlen_Operations.max_sum(noten));
    }

    @Test
    public void testMinSumSuccess() {
        int[] noten = {85, 90, 78, 90, 92, 85};
        int expected = 428;
        assertEquals(expected, Zahlen_Operations.min_sum(noten));
    }



    @Test
    public void testMaxNRBreak() {
        int[] zahlen = {12, 45, 67, 89, 23};
        int expected = 12;

        assertNotEquals(expected, Zahlen_Operations.maxNR(zahlen));
    }

    @Test
    public void testMinNRBreak() {
        int[] zahlen = {12, 45, 67, 89, 23};
        int expected = 45;

        assertNotEquals(expected, Zahlen_Operations.minNR(zahlen));
    }

    @Test
    public void testMaxSumBreak() {
        int[] noten = {85, 90, 78, 90, 92, 85};
        int expected = 300;

        assertNotEquals(expected, Zahlen_Operations.max_sum(noten));
    }

    @Test
    public void testMinSumBreak() {
        int[] noten = {85, 90, 78, 90, 92, 85};
        int expected = 200;

        assertNotEquals(expected, Zahlen_Operations.min_sum(noten));
    }
}
