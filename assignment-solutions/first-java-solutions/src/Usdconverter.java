import java.util.Scanner;

public class Usdconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter indian rupee");
        double inr = input.nextDouble();
        double ConversionRate = 0.012;
        double usd = inr * ConversionRate;
        System.out.println("USD as of 11/01/2023 -> DD/MM/YYYY : "+ usd);
    }
}
