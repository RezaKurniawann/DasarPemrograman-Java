public class ifelse {
    public static void main(String[] args) {

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("20 is greater than 18 (True)");
        } else {
            System.out.println("20 is not greater than 18 (False)");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good Morning");
        } else if (time < 18) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good Evening");
        }

        int doorCode = 1234;
        if (doorCode == 1234) {
            System.out.println("Correct Code. The door is now open");
        } else {    
            System.out.println("Wrong Code. The door remains closed");
        }

        int myNum = -10;
        if (myNum > 0) {    
            System.out.println("The value is a positive number");
        } else if (myNum < 0 ){
            System.out.println("The value is a negative number");
        } else {
            System.out.println("The value is 0");
        }

        int myNum2 = 5;
        if (myNum2 % 2 == 0) {
            System.out.println(myNum2 + "is even");
        }   else {
            System.out.println(myNum2 + "is odd");
        }


        //Ternary Operator
        String result = (time < 18) ? "Good Day" : "Good Evening";
        System.out.println(result);


    }
}