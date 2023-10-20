import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(5, 6, 7, 8));

        System.out.println(ZahlenArray_Operations.add(arr1, arr2));
        System.out.println(ZahlenArray_Operations.sub(arr2, arr1));
        System.out.println(ZahlenArray_Operations.mul(arr1, 3));
        System.out.println(ZahlenArray_Operations.div(arr1, 3));

    }
}