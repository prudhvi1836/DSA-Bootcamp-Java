public class CompoundInterest {
    public static void main(String[] args) {
        float    princple =20_000f;
        float interestRate = 0.1f;
        int    years = 25;
        for(int i=0;i<years;i++){
            princple = princple+(interestRate*princple);
        }
        System.out.println(princple);
    }
}
