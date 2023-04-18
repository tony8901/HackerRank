package week2;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class GridChallengeResult {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here

        //the string to return
        String resp = "YES";

        //list to store the sorted arrays of chars
        List<char[]> orderedCharList = new ArrayList<>();

        //add chars arrays to list
        grid.forEach(s -> {
            //each char array
            char[] charArray = s.toCharArray();

            //sort
            Arrays.sort(charArray);

            //add
            orderedCharList.add(charArray);
        });

        //if any character in the column is greater than the next in the same column the answer is NO
        for (int i = 0; i < orderedCharList.size()-1; i++) {
            for (int j = 0; j < orderedCharList.get(i).length; j++) {
                if (orderedCharList.get(i)[j] > orderedCharList.get(i + 1)[j]) {
                    resp = "NO";
                    break;
                }
            }
        }

        return resp;
    }

}

public class GridChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(toList());

                String result = GridChallengeResult.gridChallenge(grid);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
