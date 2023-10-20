import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZahlenArray_Operations_Test {

    @Test
    public void testAdd() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(5, 6, 7, 8));

        ArrayList<Integer> expected = new ArrayList<>(List.of(6, 9, 1, 2));
        assertEquals(expected, ZahlenArray_Operations.add(arr1, arr2));
    }

    @Test
    public void testSub() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(5, 6, 7, 8));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(1, 2, 3, 4));

        ArrayList<Integer> expected = new ArrayList<>(List.of(4, 4, 4, 4));
        assertEquals(expected, ZahlenArray_Operations.sub(arr1, arr2));
    }

    @Test
    public void testMul() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 9));
        int num = 3;

        ArrayList<Integer> expected = new ArrayList<>(List.of(3, 7, 1, 7));
        assertEquals(expected, ZahlenArray_Operations.mul(arr, num));
    }

    @Test
    public void testMul2() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(9));
        int num = 2;

        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 8));
        assertEquals(expected, ZahlenArray_Operations.mul(arr, num));
    }

    @Test
    public void testDiv() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(6, 9, 1, 2, 2));
        int num = 3;

        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 3, 0, 0, 0));
        assertEquals(expected, ZahlenArray_Operations.div(arr, num));
    }




    @Test
    public void testAddBreak() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(5, 6, 7, 8));

        ArrayList<Integer> expected = new ArrayList<>(List.of(6, 3, 1, 2));
        try {
            assertEquals(expected, ZahlenArray_Operations.add(arr1, arr2));
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testSubBreak() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(5, 6, 7, 8));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(1, 2, 3, 4));

        ArrayList<Integer> expected = new ArrayList<>(List.of(4, 1, 4, 4));
        try {
            assertEquals(expected, ZahlenArray_Operations.sub(arr1, arr2));
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMulBreak() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 9));
        int num = 3;

        ArrayList<Integer> expected = new ArrayList<>(List.of(3, 7, 5, 7));
        try {
            assertEquals(expected, ZahlenArray_Operations.mul(arr, num));
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testDivBreak() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(6, 9, 1, 2, 2));
        int num = 3;

        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 3, 0, 9, 0));
        try {
            assertEquals(expected, ZahlenArray_Operations.div(arr, num));
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }
    }
}
