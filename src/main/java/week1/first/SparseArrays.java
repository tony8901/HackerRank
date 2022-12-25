package week1.first;

import java.util.ArrayList;
import java.util.List;


public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for (String i : queries){
            int cont = 0;
            for (String j : strings){
                if(i.equals(j)) cont++;
            }
            result.add(cont);
        }

        return result;
    }
}
