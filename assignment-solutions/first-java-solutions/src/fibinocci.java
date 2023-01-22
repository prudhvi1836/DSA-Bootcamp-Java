import java.util.Scanner;

public class fibinocci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int current = 1;
        int previous = 0;
        int next = 0;

        while (next <= n) {
            next = current + previous;
            System.out.print(" " + next);
            previous = current;
            current = next;

        }


        // 0, 1, 1, 2, 3, 5, 8 , 13, 21
//         1, 2, 3, 4, 5, 5, 7 ,  8,  9
//         8th term -> 21

//        int prev = 0;
//        int current = 1;
//        int next = 0;
//        int count =3; //this count is based on index if we count the series terms from 0 its 2 if we count
//        // the series terms from 1 as represented in comments above count starts from 3
//        while(count <= 8){
//            next = prev+current;
//            prev=current;
//            current=next;
//
//            count++;
//        }
//        System.out.print(" "+ next);
//
//
    }
}
