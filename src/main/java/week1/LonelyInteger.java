package week1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        if(a.size() == 1) return a.get(0);
        int result = -1;
        for (int i = 0; i < a.size(); i++) {
            int cont = 0;
            result = a.get(i);
            for (int j = 0; j < a.size(); j++) {
                if(a.get(j) == result && i != j) cont++;
            }
            if (cont == 0) return result;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.printf(String.valueOf(lonelyinteger(list)));
    }
}
