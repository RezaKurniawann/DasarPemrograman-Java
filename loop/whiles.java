public class whiles {
    public static void main(String[] args) {
        //while
        System.out.println("While");
        int num1 = 0;
        while (num1 <= 5) {
            System.out.println(num1);
            num1++;
        }
        System.out.println();

        //do-while
        System.out.println("Do-While");
        int num2 = 0;
        do {
            System.out.println(num2);
            num2++;
        } while (num2 <= 5);
        System.out.println();

        //example
        System.out.println("Example");
        int counDown = 3;
        while (counDown > 0) {
            System.out.println(counDown);
            counDown--;
        }
        System.out.println("GO!!");
        System.out.println();

        int grade = 40;
        while (grade <= 70) {
        if (grade < 70) {
            System.out.println("Failed!");
        } else {
            System.out.println("Succes!");
        }
        grade += 10;
        }

    }
}
