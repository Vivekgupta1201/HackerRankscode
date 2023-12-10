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

    public static long repeatedString(String s, long n) {
    // Write your code here
    long count=0,total=0,reminder=0;
    List<Integer> indexofa=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a')
               indexofa.add(i);
            }
            total=indexofa.size()*(n/s.length());
            reminder=n%s.length();
            for(int j=0;j<indexofa.size();j++){
                if(reminder-1>=indexofa.get(j))
                total+=1;
                
                else if(reminder-1<indexofa.get(j)){
                   
                    break;
                }
                
            }
            
return total;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
