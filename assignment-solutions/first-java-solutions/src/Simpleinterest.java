import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Simpleinterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter principle amount");
        int p = input.nextInt();
        System.out.println("enter time");
        int t = input.nextInt();
        System.out.println("enter rate of interest");
        float r = input.nextFloat();

        float si = (p*t*r)/100;
        System.out.println( p*t*r);

        System.out.println(si);

    }
}
