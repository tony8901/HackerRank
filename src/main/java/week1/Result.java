package week1;

import java.util.*;

public class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i : arr){
            if(i > 0) positive++;
            else if(i < 0) negative++;
            else zero++;
        }
        if(positive>0) System.out.printf("%.6f",positive/arr.size());
        else System.out.printf("%.6f",positive);
        System.out.println();
        if(negative>0) System.out.printf("%.6f",negative/arr.size());
        else System.out.printf("%.6f",negative);
        System.out.println();
        if(zero>0) System.out.printf("%.6f",zero/arr.size());
        else System.out.printf("%.6f",zero);
    }

}

