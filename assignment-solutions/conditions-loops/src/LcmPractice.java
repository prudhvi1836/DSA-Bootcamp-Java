 class LcmPractice {

     public static void main(String[] args) {
        int  num1 = 2;
        int  num2 =4;
        int min= 2; //find the minimum number
        while (true){
            if(min%num1 == 0 && min%num2 ==0){
                System.out.println(min);
                break;
            }
            min++;

        }
     }
}
