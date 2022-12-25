package week1.first;

public class FlippingBits {

    public static long flippingBits(long n) {
        // Write your code here
        String str = Long.toBinaryString(n);
        String complete = "";
        for (int i = 0; i < 32-str.length(); i++) {
            complete+=0;
        }
        str = complete.concat(str);
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == '0') array[i] = '1';
            else array[i] = '0';
        }
        str = String.valueOf(array);
        return Long.parseLong(str,2);
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(0));
    }
}
