import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(ob.readLine());
        while(t-- > 0){
            String s = ob.readLine();
            String eve = "";
            String odd = "";
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0){
                    eve += s.charAt(i);
                }else{
                    odd += s.charAt(i);
                }
            }
            System.out.println(eve+" "+odd);
        }
    }
}
