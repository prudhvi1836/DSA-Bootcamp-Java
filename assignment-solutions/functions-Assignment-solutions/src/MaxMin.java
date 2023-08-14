public class MaxMin {
    public static void main(String[] args) {
         System.out.println(max(100,9,10));
         System.out.println(min(100,9,10));

    }
    static int max(int num1,int num2,int num3){
        int max = num1;
            if(num2>max){
                max = num2;
            }
            if(num3>max){
                max = num3;
            }
        return max;
    }

    static int min(int num1,int num2,int num3){
        int min = num1;
            if(num2<min){
                min = num2;
            }
            if(num3<min){
                min = num3;
            }
        return min;
    }

}
