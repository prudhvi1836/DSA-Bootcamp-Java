public class fibinocci {
    public static void main(String[] args) {

        System.out.print(0+" "+1+" ");

        fibinocci(9);
    }

    static void fibinocci(int n){
        int current = 1;
        int previous =0;
        int  result  =0;
        for(int i=2; i<=n;i++){
            result=current+previous;
            System.out.print(result+" ");
            previous= current;
            current=result;
        }

    }


}
