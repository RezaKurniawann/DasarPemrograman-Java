public class breakContinue {

    public static void main(String[] args) {
        System.out.println("For + break");
        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 4) {
    
                break;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println("For + continue");
        for (i = 1; i <= 10; i++) {
            if (i == 4) {
              
                continue;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println("While + break");
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            if (i == 4) {

                break;
            }
        }

        System.out.println();
        System.out.println("While + continue");
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                
                continue;
            }
        }
    }
}
