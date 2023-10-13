import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public class Student {
        private String name;
        private int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", grade=" + grade + "]";
        }
    }


    // method that gets an array and returns the grades that are lower than 38
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


    public static void main(String[] args) {
        int[] noten = {10, 30, 29, 33, 50, 84};

        System.out.println(Arrays.toString(low_grades(noten)));
        System.out.println(average_grade(noten));
        System.out.println(Arrays.toString(rounded_grades(noten)));
        System.out.println(maximal_grade(noten));


    }
}