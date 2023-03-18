package week1;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            result.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            result.set(arr.get(i), result.get(arr.get(i))+1);
        }
        return result;
    }

}
