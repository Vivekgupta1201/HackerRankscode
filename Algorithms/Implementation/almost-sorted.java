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
     * Complete the 'almostSorted' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void almostSorted(List<Integer> arr) {
    // Write your code here
    ArrayList<Integer> arrr=new ArrayList<>();
    for (int i = 0; i < arr.size(); i++){
            arrr.add(arr.get(i));
    }
   ArrayList ar
            = (ArrayList)arrr.clone();
              Collections.sort(ar);
             
              
              int count=0,ind=0,ind2=0,n=arr.size()-1,flag2=0;
              
              for(int i=0;i<arrr.size();i++){
                  if(arr.get(i)!=ar.get(i)){
                      ind =i;
                     
                      break;
                  }
              }
              
              for(int i=arr.size()-1;i>ind;i--){
                  if(arr.get(ind)==ar.get(i)){
                      
                      ind2=i;
                     
                      break;
                  }
                  
              }
             
             
            if(ind2-ind!=1&&arr.get(ind+1)!=ar.get(ind+1)){
                flag2=1;
                  int max=(ind+ind2)/2;
                  int x=ind2;
                  for(int k=ind;k<=max;k++){
                       int temp=arr.get(k);
                              arr.set(k,arr.get(x));
                              arr.set(x,temp);
                              x--;
                  } 
              }
              else{
                  
                  int temp=arr.get(ind);
                  arr.set(ind,arr.get(ind2));
                  arr.set(ind2,temp);
                  flag2=0;
                  
              }
              
              
        
              int flag=0;
              for(int k=0;k<arr.size();k++){
                  
                  if(!(ar.get(k)).equals(arr.get(k))){
                      
                      flag=1;
                  }
                  
              }
               
            
            if(flag==0){
                if(flag2==0){
                  System.out.println("yes");
                  System.out.println("swap "+(ind+1)+" "+(ind2+1)); 
                  return;  
              }
              
              else if(flag2==1){
                   System.out.println("yes");
                  System.out.println("reverse "+(ind+1)+" "+(ind2+1));
                  return;
              }
             }
            
               System.out.println("no");
             
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.almostSorted(arr);

        bufferedReader.close();
    }
}
