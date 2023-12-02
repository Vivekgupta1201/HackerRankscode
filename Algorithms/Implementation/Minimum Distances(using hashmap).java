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


    public static int minimumDistances(List<Integer> a) {
   
    int min=Integer.MAX_VALUE;
    HashMap<Integer,Integer> hs=new HashMap<>();
    for(int i=0;i<a.size();i++){
        if(hs.containsKey(a.get(i))){
         min=Math.min(min,i-hs.get(a.get(i)));
        hs.put(a.get(i),i);
          
        }
        else
        hs.put(a.get(i),i);
    }
    
    if(min==Integer.MAX_VALUE){
        return -1;
    }
    return min;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
