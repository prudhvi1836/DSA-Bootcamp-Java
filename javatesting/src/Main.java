import java.util.Scanner;

class ArmstrongRange
{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scr.nextInt();
        System.out.println("Enter last number");
        int b = scr.nextInt();

        for(int i=a; i<=b ; i++){
            int num = i;
            int count = 0;
            while(num>0)
            {
                count++;
                num/=10;
            }
            num=i;
            int sum=0;
            while(num>0){
                int d = num%10;
                int prod =1;
                for(int j = 1 ; j<=count ; j++){
                    prod*= d;
                }
                sum+=prod;
                num/=10;
            }
            if(sum == i) System.out.print( i+ " ");
        }

    }
}



class PerfectNumRange
{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number");
        long a = scr.nextInt();
        System.out.println("Enter last number");
        long b = scr.nextInt();

        for(long i=a; i<=b; i++ ){
            long sum= 0;
            for(long j=1 ; j<= i/2; j++){
                if(i%j == 0){
                    sum+= j;
                }
            }
            if(sum == i) System.out.print(i+" ");
        }
    }

}

class StrongNumbeRange
{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first numberF");
        int a = scr.nextInt();
        System.out.println("Enter last number");
        int b = scr.nextInt();

        for(int i= a ; i<=b; i++){
            int num =i;
            int sum =0;
            while(num>0){
                int d = num%10;
                int fact =1;
                for(int j =1 ; j<=d; j++){
                    fact*=j;
                }
                sum+=fact;
                num/=10;
            }
            if(sum == i) System.out.print(i+ " ");
        }
    }
}


class MetaNum{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scr.nextInt();
        int num =a; //backup

        // length of number
        int count =0;
        while(a>0){
            count++;
            a/=10;
        }

        // square a num
        a=num;
        int squareRes= 1;
        for(int sq = 1; sq<=2;sq++){
            squareRes *= a;
        }

        // getting digits equal to the num entered by user
        int ans =0;
        int multiplier =1;
        for(int i=1; i<=count; i++)
        {
            int digit = squareRes%10;
            ans = (digit *multiplier)+ans;
            multiplier *= 10;
            squareRes/=10;
        }
        if(ans == num) System.out.println("Morph");
        else System.out.println("not morph");
    }
}