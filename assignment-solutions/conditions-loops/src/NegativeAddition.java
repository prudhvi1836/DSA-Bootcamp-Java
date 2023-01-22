import java.util.Scanner;
public class NegativeAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeInt = 0;
        int positiveEven =0;
        int positiveOdd = 0;
        while(true){
            System.out.println("Enter Number");
            int num = input.nextInt();
            if(num<0){
                negativeInt+=num;
            }
            else if (num>0){
                if(num%2==0){
                    positiveEven+=num;
                }else{
                    positiveOdd+=num;
                }
            }
            else if (num == 0){
                break;
            }
            else{
                System.out.println("invalid input please enter a integer");
            }

        }

        System.out.println(negativeInt+" "+positiveEven+" "+ positiveOdd);

    }
}
