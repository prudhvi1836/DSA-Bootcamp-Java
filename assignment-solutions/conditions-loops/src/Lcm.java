public class Lcm {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 =3;
        int min =n1;
        if(n2<n1){
            min =n2;
        }
        while(true){
            if(min%n1 ==0 && min%n2 ==0){
                System.out.println(min);
                break;
            }
            min++;
        }

    }
}
