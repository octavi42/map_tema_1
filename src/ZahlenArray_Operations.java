import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ZahlenArray_Operations {

    static ArrayList<Integer> add(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        ArrayList<Integer> sum_arr = new ArrayList<>(arr1.size()+1);

        for (int i=arr1.size(); i > 0 ; i--) {
            int sum = arr1.get(i) + arr2.get(i);
            int zahl = sum / 10;
            int rest = sum % 10;

            sum_arr.set(i, sum_arr.get(i)+zahl);
            sum_arr.set(i-1, sum_arr.get(i)+rest);
        }

        if (sum_arr.get(0) == 0) {
            sum_arr.remove(0);
        }

        return sum_arr;
    }


    static ArrayList<Integer> sub(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        ArrayList<Integer> sum_arr = new ArrayList<>(arr1.size());

        for (int i=arr1.size(); i > 0 ; i--) {
            int sub = arr1.get(i) - arr2.get(i);
            int add = 0;
            if (sub < 0){
                sub=10-sub;
                add=-1;
            }

            sum_arr.set(i, sum_arr.get(i)+sub);
            sum_arr.set(i-1, sum_arr.get(i)+add);
        }

        if (sum_arr.get(0) == 0) {
            sum_arr.remove(0);
        }

        return sum_arr;
    }


    static ArrayList<Integer> mul(ArrayList<Integer> arr, int num){

        ArrayList<Integer> mul_arr = new ArrayList<>(arr.size());

        for (int i=0; i < num; i++) {

            mul_arr = add(arr, arr);

        }

        return mul_arr;

    }

    static ArrayList<Integer> div(ArrayList<Integer> arr, int num) {

        ArrayList<Integer> div_arr = new ArrayList<>(arr.size());

        for (int i=0; i < arr.size(); i++) {

            div_arr.set(i, arr.get(i) / num);

        }

        return div_arr;

    }

}
