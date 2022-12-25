package week1.first;

public class TimeConversion {


    public static String timeConversion(String s) {
        // Write your code here
        String[] arr = s.split(":");
        int hours =  Integer.parseInt(arr[0]);
        if(arr[2].charAt(2)=='A'){
            if(hours==12) hours = 0;
        }else if(hours!=12) hours+=12;
        return String.format("%02d", hours)+":"+String.format("%02d", Integer.parseInt(arr[1]))+":"+arr[2].charAt(0)+arr[2].charAt(1);
    }

    public static void main(String[] args) {
        System.out.printf(timeConversion("1:59:59PM"));
    }
}
