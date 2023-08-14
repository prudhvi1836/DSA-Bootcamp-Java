import java.util.Scanner;

public class BetweenPrimes {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int startRange = ip.nextInt();
        int endRange = ip.nextInt();
        for(int i = startRange; i<=endRange; i++){
           if(isPrime(i)){
               System.out.print(i+" ");
           }
        }
    }
    static boolean isPrime(int n){
        int c=2;
        if(n<=1){
            return false;
        }
        while(c<n){
            if(n%c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
