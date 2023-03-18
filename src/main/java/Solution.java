import week2.SalesbyMatch;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {

        SalesbyMatch salesbyMatch = new SalesbyMatch();
        System.out.println(salesbyMatch.sockMerchant1(9, Arrays.asList(10,20,20,10,10,30,50,10,20)));
    }
}