import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        String s1 = "Hello";
        s1.concat("world"); // here we tried to change s1 but since its immutable hello didnt change
                                // we can change s1 reference variable to different object but
                                // the string itself cannot be mutabke

        System.out.println(s1);

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("enter int 1 ");
//        float a = input.nextFloat();
//        System.out.println("enter int 2 ");
//        float b = input.nextFloat();
//        System.out.println("enter operator  + - * /");
//        String op = "+";
//        String add = op;
//        op = "Addition";
//
//
//
//        System.out.println(op+" "+add);
//        if(op == add ){
//            System.out.println(a+b +" "+ op.hashCode()+" "+ add.hashCode());
//        }
//        else if(op == "-"){
//            System.out.println(a-b);
//        }
//        else if(op == "*"){
//            System.out.println(a*b);
//        }
//        else if(op == "/"){
//            System.out.println(a/b);
//        }else{
//            System.out.println("incorrect operator: " + op);
//
//        }



    }
}
