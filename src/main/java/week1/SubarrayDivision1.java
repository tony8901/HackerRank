package week1;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision1 {

    //example: s=[2,2,1,3,2] d=4 m=2
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int resp = 0;
        if(m > s.size()) return 0;
        for (int i = 0; i < s.size(); i++) {
            if(i+m > s.size()) return resp;
            else{
                int temp = 0;
                for (int j = i; j < i+m; j++) {
                    temp+=s.get(j);
                }
                if(temp == d) resp++;
            }
        }
        return resp;
    }
}
