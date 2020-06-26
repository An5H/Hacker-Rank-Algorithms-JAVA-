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
        String x;
        while((x = ob.nextLine()) != null){
        if(x.length() % 2 != 0){
            System.out.println("false");
        }else{
            Stack <Character> stack = new Stack<>();
            boolean flag = true;
            for(int i = 0; i < x.length(); i++){
                if(x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '['){
                    stack.push(x.charAt(i));
                }
                else if(!stack.isEmpty() && ((x.charAt(i) == '}' && stack.peek() == '{')
                                        || (x.charAt(i) == ')' && stack.peek() == '(') 
                                        || (x.charAt(i) == ']' && stack.peek() == '[')))
                                                
                {
                    stack.pop();
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag && stack.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
        }
    }
}
