import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks");
        int num = input.nextInt();
        System.out.println(grade(num));
    }

    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail
    static String grade(int num) {
        if (num >= 91 && num <= 100) {
            return "AA";
        } else if (num >= 81 && num <= 90) {
            return "AB";
        } else if (num >= 71 && num <= 80) {
            return "BB";
        } else if (num >= 61 && num <= 70) {
            return "BC";
        } else if(num >=51 && num<=60){
            return "CD";
        } else if(num >=41 && num<=50){
            return "DD";
        }else if (num <=40){
            return "Fail";
        }

        return "Please enter integers with in the range 0-100";
    }
}
