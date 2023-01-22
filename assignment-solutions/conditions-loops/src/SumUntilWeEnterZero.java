import java.util.Scanner;

public class SumUntilWeEnterZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        while(true){
            System.out.println("Input number");
            int number  = input.nextInt();

            if(number==0){
                break;
            }
            sum+=number;

        }
        System.out.println("Final Sum is: "+ sum);
    }
}
