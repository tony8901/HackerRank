package week1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MockTest {

    /*
TESTCASE   DIFFICULTY   TYPE            STATUS          SCORE  TIMETAKEN   MEMORY USED
Testcase 1 Easy         Sample case     Success         0      0.1021 sec  29.8 KB
Testcase 2 Easy         Hidden case     Success         35     0.2511 sec  31.4 KB
Testcase 3 Easy         Hidden case     Success         35     0.5546 sec  102 KB
Testcase 4 Easy         Hidden case     Terminated
                                        due to timeout  0      4.0155 sec  199 KB
     */
    public int findMedian(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.comparingInt(a -> a));
        return arr.get(arr.size() / 2);
    }

    //Algorithm not finished
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                for (int k = j; k < matrix.get(i).size(); k++) {
                    if (matrix.get(i).get(k) > matrix.get(i).get(j)) {
                        int temp = matrix.get(i).get(j);
                        matrix.get(i).set(j, matrix.get(i).get(k));
                        matrix.get(i).set(k, temp);
                    }
                }
            }
        }
        int resp = 0;
        for (int i = 0; i < matrix.size() / 2; i++) {
            for (int j = 0; j < matrix.get(i).size() / 2; j++) {
                resp += matrix.get(i).get(j);
            }
        }
        for (List<Integer> list : matrix){
            System.out.println(list);
        }

        return resp;
    }

    //5 marzo 2023
    public int flippingMatrix1(List<List<Integer>> matrix){
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                int x = 8;
            }
        }
        return 0;
    }


}
