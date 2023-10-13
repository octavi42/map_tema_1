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



    public static void main(String[] args) {
        int[] noten = {10, 30, 29, 33, 50, 84};

        System.out.println(Arrays.toString(Notes_Operations.low_grades(noten)));
        System.out.println(Notes_Operations.average_grade(noten));
        System.out.println(Arrays.toString(Notes_Operations.rounded_grades(noten)));
        System.out.println(Notes_Operations.maximal_grade(noten));


    }
}