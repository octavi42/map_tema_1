import java.util.ArrayList;

public class Notes_Operations {

    static ArrayList<Integer> low_grades(ArrayList<Integer> noten) {
        ArrayList<Integer> finalGrades = new ArrayList<>();
        for (int grade : noten) {
            if (grade < 38) {
                finalGrades.add(grade);
            }
        }
        return finalGrades;
    }

    static double average_grade(ArrayList<Integer> noten) {
        if (noten.isEmpty()) {
            return 0.0; // Handle the case where the ArrayList is empty.
        }

        int sum = 0;
        for (int grade : noten) {
            sum += grade;
        }

        return (double) sum / noten.size();
    }

    // method that returns the rounded grades
    static ArrayList<Integer> rounded_grades(ArrayList<Integer> noten) {
        ArrayList<Integer> roundedGrades = new ArrayList<>();

        for (int grade : noten) {
            // Find the next multiple of 5 for the grade
            int nextMultiple = (int) (grade / 5) * 5 + 5;

            System.out.println(nextMultiple);
            System.out.println(grade);


            System.out.println(grade - nextMultiple);
            System.out.println();

            if (grade - nextMultiple > -3) {
                roundedGrades.add(nextMultiple);
            } else {
                roundedGrades.add(grade);
            }
        }

        return roundedGrades;
    }


    // method that returns the maximal rounded grades
    static int maximal_grade(ArrayList<Integer> noten) {
        if (noten.isEmpty()) {
            return -1; // Handle the case where the ArrayList is empty.
        }

        ArrayList<Integer> roundedGrades = rounded_grades(noten);
        int maxGrade = roundedGrades.get(0);

        for (int i = 1; i < roundedGrades.size(); i++) {
            if (roundedGrades.get(i) > maxGrade) {
                maxGrade = roundedGrades.get(i);
            }
        }

        return maxGrade;
    }

}
