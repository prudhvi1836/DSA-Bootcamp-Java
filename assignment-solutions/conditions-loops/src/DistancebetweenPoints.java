import java.util.Scanner;

public class DistancebetweenPoints {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int xSquared = (x2-x1)*(x2-x1);
        int ySquared = (y2-y1)*(y2-y1);
        System.out.println(Math.sqrt(xSquared+ySquared)+ " Units");
    }

}
