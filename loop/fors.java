public class fors {
    public static void main(String[] args) {
        System.out.println("For Loop");
        int i;
        int j;
        for (i = 0; i < 5; i++ ) {
            System.out.println(i);
        }

        System.out.println();
        for (i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();
        //outer loop
        for (i = 1; i <= 3; i++) {
            System.out.println("Outer : " + i);
            //inner loop
            for (j = 1; j <= 3; j++) {
                System.out.println("Inner : " + j);
            }
        }

        System.out.println();
        String cars [] = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("For-each");
        for (String c : cars) {
            System.out.println(c);
        }

        System.out.println();
        
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (j*i));                
            }
        }

    }
}
