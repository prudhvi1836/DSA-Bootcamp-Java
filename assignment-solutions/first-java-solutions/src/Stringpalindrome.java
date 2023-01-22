import java.util.Scanner;

public class Stringpalindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String checkPalindrome = input.next();
        String lowerCaseP = checkPalindrome.toLowerCase();
        int palindromeLength = checkPalindrome.length();
        int i;
        for (i = 0; i < (palindromeLength/2); i++) {
            if (lowerCaseP.charAt(i) != lowerCaseP.charAt(palindromeLength - i - 1)) {
                System.out.println("Not a Palindrome");
                break;
            }
        }
        if(i==(palindromeLength/2)){
            System.out.println("palindrome");
        }

    }
}
