public class casting {
    public static void main(String[] args) {
         /*
         * Widening Casting  : byte -> short -> char -> int -> long -> float -> double
         * Narrowing Casting : double -> float -> long -> int -> char -> short -> byte
         */

        System.out.println("Widening Casting");
        int numInt = 9;
        double numDouble = (double) numInt;
        System.out.println("int : " + numInt);
        System.out.println("double : " + numDouble + "\n");

        System.out.println("Narrowing Casting");
        numDouble = 8.7;
        numInt = (int) numDouble;
        System.out.println("double : " + numDouble );
        System.out.println("int : " + numInt + "\n");
    
        System.out.println("Example");
        int maxScore = 500;
        int userScore = 350;

        float precentage = (float)userScore/maxScore * 100;
        System.out.println("User's precentage is " + precentage);

    }
}
