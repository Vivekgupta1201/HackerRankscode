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
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */
    static int digit=-1;
     public static int reverse(int n){
         
          int temp1=0;
       digit=-1;
          while(n>0){
          
         temp1=(temp1*10)+(n%10);
         digit++;
         n=n/10;
      }
    
      return temp1;
         
     }

    public static int beautifulDays(int i, int j, int l) {
    // Write your code here
    int count=0,sum1=0;
       
         float sum=0;
     int temp=reverse(i);
     
       for(int k=i;k<=j;k++){
           if(k%10!=0){
                  //  System.out.println(temp);
              sum=(float)(Math.abs(k-temp))/l;
              sum1=(Math.abs(k-temp))/l;
              temp+=Math.pow(10,digit);
            
               if(sum1==sum){
               count++;
               } 
               
              
           }
           else{
           temp=reverse(k);
           // System.out.println(temp);
            sum=(float)(Math.abs(k-temp))/l;
              sum1=(Math.abs(k-temp))/l;
              temp+=Math.pow(10,digit);
            
               if(sum1==sum){
               count++;
               } 
     
               
           }
            
       }

 
return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
