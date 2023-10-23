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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
    s = s.replaceAll("\\s", "");
    String ans="";
    int stringlength=s.length();
   double z=Math.sqrt(stringlength);
   int k=(int)z;
   if(z!=k){
       k=k+1;
   }
   else
   k=k;
    
    for(int i=0;i<k;i++){
        for(int j=i;j<s.length();j=j+k){
            ans+=s.charAt(j);
        }
        ans+= " ";
    }
 
return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
