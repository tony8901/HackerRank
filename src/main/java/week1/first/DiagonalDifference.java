package week1.first;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRight = 0;
        int rightToLeft = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftToRight += arr.get(i).get(i);
        }
        int cont = 0;
        for (int i = arr.size()-1; i >= 0; i--) {
            rightToLeft += arr.get(i).get(cont);
            cont++;
        }

        return Math.abs(leftToRight-rightToLeft);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(2);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(8);
        list3.add(-12);
        List<List<Integer>> arr = new ArrayList<>(3);
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);

        System.out.println(diagonalDifference(arr));
    }
}
