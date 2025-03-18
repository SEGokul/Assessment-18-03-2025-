class Solution {
    public static boolean isPalindrome(int x) {
        int reverse = x;
        int digit = 0 ;
        int sign = 1;
        if (x<0){
            sign =-1;
            x=-x;    
        }
        while (x>0){
        int remainder = x%10;
        digit = digit*10+remainder;
        x=x/10;
        }
        if (digit==reverse){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String args []){
        int num = 123;
        System.out.print(isPalindrome(num));
    }
}
