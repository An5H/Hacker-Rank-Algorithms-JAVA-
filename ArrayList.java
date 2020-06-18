import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <ArrayList<Integer>> arr = new ArrayList <ArrayList<Integer>>();
        ArrayList <ArrayList<Integer>> queries = new ArrayList <ArrayList<Integer>>();
        int n = Integer.parseInt(ob.readLine());
        while(n-- > 0){
            ArrayList <Integer> cur = new ArrayList <>();
            String [] curString = ob.readLine().trim().split(" ");
            for(int i = 1; i < Integer.parseInt(curString[0]); i++){
                cur.add(Integer.parseInt(curString[i]));
            }
            arr.add(cur);
        }
        int q = Integer.parseInt(ob.readLine());
        while(q-- > 0){
            ArrayList <Integer> cur = new ArrayList <>();
            String [] curString = ob.readLine().trim().split(" ");
            cur.add(Integer.parseInt(curString[0]));
            cur.add(Integer.parseInt(curString[1]));
            queries.add(cur);
        }
        new check().compute(arr, queries);
    }
}
class check{
    static void compute(ArrayList <ArrayList<Integer>> arr, ArrayList <ArrayList<Integer>> queries){
        for(int i = 0; i < queries.size(); i++){
            int curRow = queries.get(i).get(0)-1;
            int curColumn = queries.get(i).get(1)-1;
            if(arr.get(curRow).size() < curColumn){
                System.out.println("ERROR!");
            }else{
                int element = (arr.get(curRow)).get(curColumn);
                System.out.println(element);
            }
        }
    }
}





