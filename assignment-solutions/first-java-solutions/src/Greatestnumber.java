import java.util.Scanner;

public class Greatestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = input.nextInt();
        System.out.println("Enter number 2");
        int b = input.nextInt();

        if(a>b){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b + " is greater");
        }

    }
}
