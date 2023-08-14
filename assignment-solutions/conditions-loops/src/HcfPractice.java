public class HcfPractice {
    public static void main(String[] args) {
        int num1 = 36;
        int num2  =64;
        int res =0;
        for(int i=1 ;i<=32 ; i++){
            if(num1%i ==0 && num2%i ==0){
                res = i;
            }
        }
        System.out.println(res);
    }
}
