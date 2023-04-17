package week2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class SolutionDrawingBook {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    /* da un error en el el utimo caso de prueba
     * no se por que definen el caso de prueba 6-5 si el problema dice
     * que la ultima pagina solo esta escrita en el anverso
     * tengo que tener siempre en cuenta que la utilizacion de ciclos es lo ultimo
     * en lo que se piensa en los problemas basicos
     */
    public static int pageCount(int n, int p) {
        // Write your code here
        if(n <= 1 || p <= 1 || p >= n-1) return 0;

        int front = 0;
        int back = 0;

        //front
        for (int i = 3; i < n; i = i+2) {
            if(p <= i) {
                front++;
                break;
            }
            else front++;
        }

        for (int i = n-2; i > 1; i = i-2) {
            if(p >= i-1){
                back++;
                break;
            }else back++;
        }

        return Math.min(back, front);
    }

    //sacada de los foros (dios santo que no hay manera que yo optimize)
    public static int pageCount1(int n, int p) {
        if(p <= n/2) return p/2;
        if(n%2 == 0) return (n - p + 1)/2;
        return (n - p)/2;
    }

}

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        System.out.println(SolutionDrawingBook.pageCount1(n, p));
    }
}
