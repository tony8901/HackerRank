package week1.first;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < B.size(); j++) {
                if (A.get(i) + B.get(j) >= k) {
                    if(B.get(i) + A.get(i) < k){
                        int temp = B.get(i);
                        B.set(i, B.get(j));
                        B.set(j, temp);
                    }else if(B.get(i)+A.get(i) > A.get(i)+B.get(j)){
                        int temp1 = B.get(i);
                        B.set(i, B.get(j));
                        B.set(j, temp1);
                    }
                }
            }
        }
        boolean b = true;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                b = false;
                break;
            }
        }
        if(b) return "YES";
        else return "NO";
    }

}
