public class Main {
    public static void main(String[] args) {

//        int i= 'A';
//        int b= 'a';
//        int diff =b-i;
////        System.out.println(b);
//        while(i<='Z'){
//            System.out.print((char)i+ " "+ (char)(i+diff)+" ");
//
//            i++;
//        }

//         int n = 13839;
//         int countSeven = 0;
//
//         while(n!=0){
//             int digit = n%10;
//             if(digit == 3){
//                 countSeven= countSeven+1;
//             }
//             n=n/10;
//         }
//
//        System.out.println(countSeven);

//        int num = 23589;
//        int reverse = 0;
//
//        while(num>0){
//            int digit = num%10;
//            reverse = reverse*10+ digit;
//            num = num/10;
//        }
//        System.out.println(reverse);


         String s1 = "ABC";
         String s2 = "ABC";

         if(s1 == s2){
             System.out.println("equal reference"+" "+s1.hashCode()+" "+s2.hashCode() );
         }else{
             System.out.println("not equal");
         }



    }
}