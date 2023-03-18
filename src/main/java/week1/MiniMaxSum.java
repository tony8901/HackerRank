package week1;

import java.util.List;

public class MiniMaxSum {


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (j!=i) sum+= arr.get(j);
            }
            if(i==0) min = sum;
            if (sum > max) max=sum;
            if (sum < min) min=sum;
        }
        System.out.print(min+" "+max);
    }
}
