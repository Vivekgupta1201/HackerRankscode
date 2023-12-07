import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    
static int jumpingOnClouds(int[] c, int k) {
        
        int i=0,n=c.length,x=100;
    
        while(true){
          
           if(c[i]==c[(i+k)%n]){
              if(c[i]==0){
                  x-=1;
                   i=(i+k)%n;
              }
              if(c[i]==1){
                  x-=3;
                   i=(i+k)%n;
              }
               
           } 
            else if(c[i]!=c[(i+k)%n]){
                if(c[(i+k)%n]==0){
                    x-=1;
                     i=(i+k)%n;
                    
                    
                }
                else{
                    x-=3;
                     i=(i+k)%n;
                }
            }
            if(i==0){
                return x;
            }
            
           
           
        }
       
    }

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
