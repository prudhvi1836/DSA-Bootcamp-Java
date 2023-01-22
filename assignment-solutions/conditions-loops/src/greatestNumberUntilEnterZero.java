import java.util.Scanner;
public class greatestNumberUntilEnterZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max =0;
        while(true){
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if(number == 0){
                break;
            }
            if(number>max){
                max=number;
            }
        }
        System.out.println("The maximum number entered is "+max);
    }
}
