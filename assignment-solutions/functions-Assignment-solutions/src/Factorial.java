import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num = ip.nextInt();
        System.out.println(factorial(num));
    }
    static long factorial(int n){
        long f=1;
        while(n>0){
            f=f*n;
            n--;
        }
    return f;
    }
}
