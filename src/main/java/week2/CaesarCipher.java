package week2;
import javax.print.DocFlavor;
import java.io.*;
import java.util.function.BiFunction;
import java.util.function.Function;

class ResultCaesarCipher {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        char[] strChar = s.toCharArray();
        StringBuilder resp = new StringBuilder();
        if(k >= 26) k = k%26;

        for (char c : strChar) {
            if (97 <= c && c <= 122) {
                if (c + k > 122) {
                    resp.append((char) (97 + ((c + k) - 123)));
                } else {
                    resp.append((char) (c + k));
                }
            } else if (65 <= c && c <= 90) {
                if (c + k > 90) {
                    resp.append((char) (65 + ((c + k) - 91)));
                } else {
                    resp.append((char) (c + k));
                }
            } else {
                resp.append(c);
            }
        }
        return resp.toString();
    }

    //probando funciones y metodos utiles
    public static BiFunction<int[], Integer, int[]> utilRotateFunction = (ints,k)->{
        for(int i = 0; i < k; i++){
            int firstElement = ints[0];
            int cont;
            for(cont = 0; cont < ints.length-1; cont++){
                ints[cont] = ints[cont+1];
            }
            ints[cont] = firstElement;
        }
        return ints;
    };

    public static int[] utilRotate(int[] ints, int k){
        for(int i = 0; i < k; i++){
            int firstElement = ints[0];
            int cont;
            for(cont = 0; cont < ints.length-1; cont++){
                ints[cont] = ints[cont+1];
            }
            ints[cont] = firstElement;
        }
        return ints;
    }

    public static Function<char[], int[]> utilConvertCharAscii = x -> {
      int[] resp = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            resp[i] = (int) x[i];
        }
        return resp;
    };

    public static int[] utilConvertCharToAscii(char[] strArray){
        int[] resp = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            resp[i] = (int) strArray[i];
        }
        return resp;
    }

}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
//        char[] x = new char[]{'a','b','c'};
//        if(x[0] == 97) System.out.println("ok");

//        char y = 97;
//        System.out.println(27%26);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = ResultCaesarCipher.caesarCipher(s, k);

        System.out.println(result);

        bufferedReader.close();
    }
}
