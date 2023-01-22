import java.util.Scanner;

public class Evenodd{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        if(a == 0 || a<1){
            System.out.println("neither even nor odd");
        }
        else if(a%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }


    }

}