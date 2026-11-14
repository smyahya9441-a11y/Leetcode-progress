class Solution {
    public boolean isPalindrome(int x) {int digit=0,revers=0,real=x;
        while(x>0){
         digit=x%10;
         x/=10;
         revers=revers*10+digit;   
        }
        if(real==revers)
  return true;
       return false;
       
    }
}