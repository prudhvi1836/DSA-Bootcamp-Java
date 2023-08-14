import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//       if(isPrime(num)){
//           System.out.println("Prime");
//       }else{
//           System.out.println("Not Prime");
//       }

        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int sum = 0;
        int originalNNum =n;
        while(n>0){
            int digit = n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        return sum==originalNNum;
    }
    static boolean isPrime(int n){
        int c= 2;
        if(n==1 || n<1){
            return false;
        }
        while(c<n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
