import java.util.ArrayList;

public class ZahlenArray_Operations {

    static ArrayList<Integer> add(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        int maxSize = Math.max(arr1.size(), arr2.size());
        ArrayList<Integer> sum_arr = new ArrayList<>(maxSize + 1);

        int carry = 0;

        for (int i = maxSize - 1; i >= 0; i--) {
            int digit1 = i < arr1.size() ? arr1.get(i) : 0;
            int digit2 = i < arr2.size() ? arr2.get(i) : 0;

            int sum = digit1 + digit2 + carry;
            int zahl = sum / 10;
            int rest = sum % 10;

            sum_arr.add(0, rest);
            carry = zahl;
        }

        if (carry != 0) {
            sum_arr.add(0, carry);
        }

        return sum_arr;
    }


    static ArrayList<Integer> sub(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int maxSize = Math.max(arr1.size(), arr2.size());
        ArrayList<Integer> diff_arr = new ArrayList<>(maxSize);

        int carry = 0;

        for (int i = maxSize - 1; i >= 0; i--) {
            int digit1 = i < arr1.size() ? arr1.get(i) : 0;
            int digit2 = i < arr2.size() ? arr2.get(i) : 0;

            int sub = digit1 - digit2 - carry;
            int add = 0;

            if (sub < 0) {
                sub += 10;
                add = 1;
            }

            diff_arr.add(0, sub);
            carry = add;
        }

        // Remove leading zeros (if any)
        while (diff_arr.size() > 1 && diff_arr.get(0) == 0) {
            diff_arr.remove(0);
        }

        return diff_arr;
    }


    static ArrayList<Integer> mul(ArrayList<Integer> arr, int num){

        ArrayList<Integer> mul_arr = arr;

        for (int i=1; i < num; i++) {
            mul_arr = add(mul_arr, arr);
        }

        return mul_arr;

    }

    static ArrayList<Integer> div(ArrayList<Integer> arr, int num) {

        ArrayList<Integer> div_arr = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            div_arr.add(0);
        }

        for (int i=0; i < arr.size(); i++) {
            div_arr.set(i, arr.get(i) / num);
        }

        while (div_arr.size() > 1 && div_arr.get(0) == 0) {
            div_arr.remove(0);
        }

        return div_arr;

    }

//    write a method

}
