import java.io.*;
import java.util.*;
/* Author: An5H :) */
class fastReader
{
    BufferedReader br;
    StringTokenizer st;

    public fastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next(){

        while (st == null || !st.hasMoreElements()){

            try{
                st = new StringTokenizer(br.readLine());
            }

            catch (IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }

    String nextLine(){
        String str = "";
        try{
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
class Solution{

    public static void main (String[] args) throws java.lang.Exception{
        fastReader ob = new fastReader();
        int t = ob.nextInt();
        HashMap <String, Long> map = new HashMap <>();
        while(t-- > 0){
            String s = ob.nextLine();
            long num = ob.nextLong();
            map.put(s, num);
        }
        String s;
        while((s = ob.nextLine()) != null)
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }else{
                System.out.println("Not found");
            }
    }
}
