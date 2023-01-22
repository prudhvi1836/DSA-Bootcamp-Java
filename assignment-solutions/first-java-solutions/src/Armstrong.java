import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number 1");
        int num1 = input.nextInt();
        int number1 = num1;
        System.out.println("number2");
        int num2 = input.nextInt();
        int number2 = num2;

        int sum1 = 0;
        int sum2 = 0;

        while (num1 != 0) {
            int digit = num1 % 10;
            sum1 = sum1 + (digit * digit * digit);
            int nextNum = num1 / 10;
            num1 = nextNum;
        }
        while (num2 != 0) {
            int digit = num2 % 10;
            sum2 = sum2 + (digit * digit * digit);
            int nextNum = num2 / 10;
            num2 = nextNum;
        }


        if (number1 == sum1 && number2 == sum2) {
            System.out.println("both n1 and n2 are armstrong numbers");
        } else if (number1 == sum1 && number2 != sum2) {
            System.out.println("num1 is armstrong");
        } else if (number1 != sum1 && number2 == sum2) {
            System.out.println("num2 is armstrong");
        }
        else{
            System.out.println("neither n1 nor n2 are armstrong numbers");
        }



    }
}