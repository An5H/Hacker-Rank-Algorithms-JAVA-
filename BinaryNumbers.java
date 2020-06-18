import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = Integer.toBinaryString(n);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char cur1 = s.charAt(i);
            if(cur1 == '0'){
                count = 0;
            }else {
                count++;
            }
            arr.add(count);
        }
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
