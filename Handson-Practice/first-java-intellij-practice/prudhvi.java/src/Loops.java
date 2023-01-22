import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius");
        float  celsiusVar  = input.nextFloat();
        float  farinheit   =  ( celsiusVar * 9/5)+32;
        System.out.println("Enter temperature in  f is : "+ farinheit);


    }
}