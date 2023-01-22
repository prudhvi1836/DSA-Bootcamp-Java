public class ReverseString {
    public static void main(String[] args) {
        String s1 = "sky";
        int n= s1.length();
        for(int i=0; i<n;i++){
            char reverse = s1.charAt(n-i-1);
            System.out.print(reverse);
        }
    }
}
