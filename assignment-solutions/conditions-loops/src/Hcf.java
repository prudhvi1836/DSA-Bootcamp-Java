public class Hcf {
    public static void main(String[] args) {
        int n1=36;
        int n2=72;
        int hcf = 0;

        for (int i=1;i<=36;i++){
            if(n1%i==0 && n2%i==0){
                 hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
