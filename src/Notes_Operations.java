public class Notes_Operations {

    static int[] low_grades(int[] noten) {
        int [] final_grades = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 38) {
                final_grades[i] = noten[i];
            }
        }

        return final_grades;
    }


    // a method that returns the average grade
    static double average_grade(int[] noten) {
        int sum = 0;
        for (int i = 0; i < noten.length; i++) {
            sum += noten[i];
        }

        return (double) sum / noten.length;
    }

    // method that returns the rounded grades
    static int[] rounded_grades(int[] noten) {
        int[] rounded_grades = new int[noten.length];
        for(int i = 0; i < noten.length; i++) {

            // find the next multiple of 5 ot the grade
            int next_multiple = (int) (noten[i] / 5) * 5;
            if (noten[i] - next_multiple < 3) {
                rounded_grades[i] = next_multiple;
            } else {
                rounded_grades[i] = noten[i];
            }
        }

        return rounded_grades;
    }


    // method that returns the maximal rounded grades
    static int maximal_grade(int[] noten) {
        noten = rounded_grades(noten);
        int max_grade = noten[0];

        for (int i = 1; i < noten.length; i++) {
            if (noten[i] > max_grade) {
                max_grade = noten[i];
            }
        }

        return max_grade;
    }

}
