import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    // Write your code here
     HashMap<Integer,String> map=new HashMap<>();
     map.put(0,"o' clock"); map.put(1,"one "); map.put(2,"two "); map.put(3,"three "); map.put(4,"four "); map.put(5,"five "); map.put(6,"six "); map.put(7,"seven "); map.put(8,"eight "); map.put(9,"nine "); map.put(10,"ten "); map.put(11,"eleven "); map.put(12,"twelve "); map.put(13,"thirteen "); map.put(14,"fourteen "); map.put(15,"quarter "); map.put(16,"sixteen "); map.put(17,"seventeen "); map.put(18,"eighteen "); map.put(19,"nineteen "); map.put(20,"twenty"); map.put(21,"twenty one "); map.put(22,"twenty two "); map.put(23,"twenty three "); map.put(24,"twentyfour "); map.put(25,"twenty five "); map.put(26,"twenty six "); map.put(27,"twenty seven "); map.put(28,"twenty eight "); map.put(29,"twenty nine "); map.put(30,"half ");
     
     
     
    
     if(m==00){
         return  (map.get(h)+"o' clock");
     }
    else if(m==15){
         return  ("quarter past "+map.get(h));
     }
    else if(m<30){
        if(m==1){
            return  (map.get(m)+"minute past "+map.get(h));
        }
        else
         return  (map.get(m)+"minutes past "+map.get(h));
     }
     else if(m==30){
         return  ("half past "+map.get(h));
     }
     else if(m>30){
         if(m==45)
         return  (map.get(60-m)+"to "+map.get(h+1));
         else
       return  (map.get(60-m)+"minutes to "+map.get(h+1));
     }
     
return "";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
