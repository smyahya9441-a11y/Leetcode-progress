class Solution {
    public int climbStairs(int n) {
        if(n<=1){
            return n;
        }
      if(n<=2){
        return n;
      }
       int first =1,seconed =2,third=0;
     for(int i=3;i<=n;i++){
        third = first+seconed;
            first =seconed;
            seconed =third;
     }return seconed;
    }
}