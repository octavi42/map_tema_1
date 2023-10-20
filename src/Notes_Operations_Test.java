import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Notes_Operations_Test {

    @Test
    public void testLowGradesSuccess() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(35);
        input.add(40);
        input.add(25);
        input.add(42);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(35);
        expected.add(25);

        assertEquals(expected, Notes_Operations.low_grades(input));
    }

    @Test
    public void testAverageGradeSuccess() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(80);
        input.add(90);
        input.add(70);
        input.add(60);

        double expected = 75.0;

        assertEquals(expected, Notes_Operations.average_grade(input), 0.01);
    }

    @Test
    public void testRoundedGradeSuccess() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(73);
        input.add(67);
        input.add(38);
        input.add(43);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(75);
        expected.add(67);
        expected.add(40);
        expected.add(45);

        assertEquals(expected, Notes_Operations.rounded_grades(input));
    }

    @Test
    public void testMaximalGradeSuccess() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(78);
        input.add(83);
        input.add(67);
        input.add(92);

        int expected = 92;

        assertEquals(expected, Notes_Operations.maximal_grade(input));
    }


    @Test
    public void testLowGradesBreak() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(35);
        input.add(40);
        input.add(25);
        input.add(42);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(40);
        expected.add(25);

        try {
            assertEquals(expected, Notes_Operations.low_grades(input));
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void testAverageGradeBreak() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(80);
        input.add(90);
        input.add(70);
        input.add(60);

        double expected = 73.0;

        try {
            assertEquals(expected, Notes_Operations.average_grade(input), 0.01);
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testRoundedGradeBreak() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(73);
        input.add(67);
        input.add(38);
        input.add(33);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(75);
        expected.add(67);
        expected.add(40);
        expected.add(33);

        try {
            assertEquals(expected, Notes_Operations.rounded_grades(input));
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMaximalGradeBreak() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(78);
        input.add(83);
        input.add(67);
        input.add(92);

        int expected = 80;

        try {
            assertEquals(expected, Notes_Operations.maximal_grade(input));
        } catch (AssertionError e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
        }
    }

}
