import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter int 1 ");
        float a = input.nextFloat();
        System.out.println("enter int 2 ");
        float b = input.nextFloat();
        System.out.println("enter operator  + - * /");
        String op = input.next();
        String add = "+";

        if(op == add){
            System.out.println(a+b);
        }
        else if(op == "-"){
            System.out.println(a-b);
        }
        else if(op == "*"){
            System.out.println(a*b);
        }
        else if(op == "/"){
            System.out.println(a/b);
        }else{
            System.out.println("incorrect operator: " + op);

        }



    }
}
