public class Hexaware {
        public static void main(String[] args) {
            int capZ = 'Z';
            int smallZ= 'z';
            int diff = smallZ-capZ;

            for (int i = 'A' ; i<='Z' ; i++){
                System.out.print((char)i+" "+ (char)(i+diff)+" ");
            }


        }
    }


