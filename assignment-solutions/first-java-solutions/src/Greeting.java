import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter guest name");
        String guest = input.nextLine();
        System.out.println("Welcome "+guest );

    }
}
