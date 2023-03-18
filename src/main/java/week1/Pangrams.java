package week1;

import java.util.List;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] count = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0;j < s.length(); j++) {
                if(letters[i].equalsIgnoreCase(s.substring(j,j+1))){
                    count[i]++;
                }
            }
        }
        boolean flag = true;
        for (int i : count){
            if(i==0) {
                flag = false;
                break;
            }
        }
        if(flag) return "pangram";
        else return "not pangram";
    }

    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(s));
    }
}
