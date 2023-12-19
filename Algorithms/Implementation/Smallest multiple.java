import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static int gcd(int n,int a){
    if(a==0)
        return n;

   return gcd(a,n%a);
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int x=1;
            for(int i=2;i<=n;i++){
               
                    x=x*i/(gcd(x,i));
                
                
            }
            System.out.println(x);
        }
    }
}
