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
   ArrayList ar = (ArrayList)arrr.clone();
              Collections.sort(ar);
              // ArrayList<Integer> ar2 = (ArrayList<Integer>)arrr.clone();
              
              int count=0,ind=0,ind2=0,flag=0,n=arr.size()-1 ,x=0;
              
              for(int i=0;i<arrr.size();i++){
                  if(arrr.get(i)!=ar.get(i)){
                      for(int j=n;j>i;j-- ){
                        
                          if(arr.get(i)==ar.get(j)){
                              int temp=arr.get(i);
                              arr.set(i,arr.get(j));
                              arr.set(j,temp);
                              count++;
                              n=j;
                              if(ind==0){
                              ind=i+1;
                              ind2=j+1;
                              }
                              
                              break;
                          }
                         
                      }
                  }
                
                 
                  
              }
                //int flag=0;
              for(int k=ind-1;k<arr.size();k++){
                  if(!(ar.get(k)).equals(arr.get(k))){
                      flag=1;
                  }
              }

              

            
             if(flag==0){
              if(count==1){
                  System.out.println("yes");
                  System.out.println("swap "+ind+" "+ ind2 );
                  
              }
              else if(count>1){
                   System.out.println("yes");
                  System.out.println("reverse "+( ind)+ " " + ind2 );
              }
             
              else
               System.out.println("no");
             }
             else
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
