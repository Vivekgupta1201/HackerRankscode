class Solution {
    public int totalMoney(int n) {
        int weak=n/7;
        int sum=0;
       
      int x= weak;
       while(x>0){
        sum+= 28+(--x)*7;
       }
        int day=n%7;
        for(int i=0;i<day;i++){
            
            weak++;
            sum+=weak;
        }
          return sum;
}
    }
  
