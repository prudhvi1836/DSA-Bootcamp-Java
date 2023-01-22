public class NumberPalindrome {
    public static void main(String[] args) {
        int n = 343;
        int nCopy = n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse= (reverse*10)+digit;
            n=n/10;
        }
        if(nCopy==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
