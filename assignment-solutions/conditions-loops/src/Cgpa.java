import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sigFixi = 0;
        float sigXi = 0;
        System.out.println("noof subjects");
        int noofSubjects =input.nextInt();

        for(int i=0 ;i<noofSubjects;i++){
            System.out.println("Enter grade");
            int grade = input.nextInt();

            System.out.println("Enter credits");
            int credits = input.nextInt();

            sigFixi+=(grade*credits);
            sigXi+=credits;

        }
        System.out.println("Cgpa is: "+ sigFixi/sigXi);

    }
}
