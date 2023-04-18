package week2;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class DynamicArrayResult {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here

        //an 2-dimensional array called 'arr'
        List<List<Integer>> arr = new ArrayList<>();

        //n arrays with zero index inside arr
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        //integer lastAnswer with initial value 0
        int lastAnswer = 0;

        //answer array
        List<Integer> answerArray = new ArrayList<>();

        //parsing queries
        for (List<Integer> i: queries){

            //idx is always calculated in the same way
            int idx = ( (i.get(1) ^ lastAnswer) % n);

            //if query start with 1
            if(i.get(0) == 1){
                arr.get(idx).add(i.get(2));
            }

            //if query start with 2
            else if(i.get(0) == 2){
                lastAnswer = arr.get(idx).get(i.get(2) % arr.get(idx).size());
                answerArray.add(lastAnswer);
            }
        }
        return answerArray;
    }

}

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = DynamicArrayResult.dynamicArray(n, queries);
        for (int i: result) System.out.println(i);

        bufferedReader.close();
    }
}
