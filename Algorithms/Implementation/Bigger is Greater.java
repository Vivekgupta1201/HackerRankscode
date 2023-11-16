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
    public static String biggerIsGreater(String w) {
    // Write your code here
    char[] word=w.toCharArray();
    String ans="";
    int ind=0;
    if(word.length==1){
        return "no answer";
    }
 
    int flag=0;
     
        int minDist = -1;
    int indexChar = 1000;

    for(int i = word.length -1; i>0; i--){
        for(int j = i-1; j>=0; j--){
           if(w.charAt(i) > w.charAt(j)){

               if(j>minDist){
                    minDist = j;
                    indexChar = i;
                    flag=1;
               }


           }
        }
    }
    if(flag==1){
         char x=word[indexChar];
                    word[indexChar]=word[minDist];
                    word[minDist]=x;
                    flag=1;
                    ind=minDist;
    }
        char b1[] = Arrays.copyOfRange(word, ind+1, word.length);
      
        Arrays.sort(b1);
          System.out.println(b1[0]);
          for(int i=0;i<=ind;i++){
              ans+=word[i];
          }
          for(int i=0;i<b1.length;i++){
              ans+=b1[i];
          }
          
       
      
   if(flag==1)
        return ans; 
        else
        return "no answer"; 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
    
