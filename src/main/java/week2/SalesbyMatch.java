package week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesbyMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int cont = 0;
        int flag = 0;
        for (int index = 0; index < ar.size(); index++) {
            for (int i = index; i < ar.size(); i++) {
                if(index != i){
                    if(ar.get(index) == ar.get(i)){
                        if(flag == 0){
                            flag=2;
                            ar.set(i,-i);
                        }else{
                            flag++;
                            ar.set(i,-i);
                        }
                    }
                }
            }
            cont+=flag/2;
            flag=0;
        }
        return cont;
    }

    //sacado de bing ai(no devuelve la respuesta correcta pero es interesante el uso de Collections)
    public static int sockMerchant1(int n, List<Integer> ar){
        int pares = 0;
        for (int elemento : ar) {
            int conteo = Collections.frequency(ar, elemento);
            pares += conteo / 2;
        }
        pares /= ar.size();
        
        return pares;
    }
}
