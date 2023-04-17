package week2;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class ResultMaxMin {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        //if the length of k is equal to the arr size, just calculate difference between max and min
        if(k == arr.size()) return arr.stream().max(Integer::compare).get()-arr.stream().min(Integer::compare).get();

        //create a copy of arr so as not modify the original
        List<Integer> tempList = arr;

        //order the array
        Collections.sort(tempList);

        //the comparator integer for response
        int resp = Integer.MAX_VALUE;

        //go for arr asking every k steps
        for (int i = 0; i <= arr.size() - k; i++) {
            //calculate difference
            int diffBetwenMaxMin = arr.get(i+k-1)-arr.get(i);

            //compare and assign if is minor
            if(diffBetwenMaxMin < resp) resp = diffBetwenMaxMin;
        }
        return resp;
    }

}

public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultMaxMin.maxMin(k, arr);
        System.out.println(result);
        bufferedReader.close();
    }
}