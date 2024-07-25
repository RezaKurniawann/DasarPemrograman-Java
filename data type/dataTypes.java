public class dataTypes {
    public static void main(String[] args) {

        System.out.println("----------------------");
        //numbers
        System.out.println("Integer Types");
        byte numByte = 100;
        System.out.println(numByte);
        short numShort = 5000;
        System.out.println(numShort);
        int numInt = 100000;
        System.out.println(numInt);
        long numLong = 15000000000L;
        System.out.println(numLong + "\n");
        //point types
        System.out.println("Point Types");
        float numFloat = 5.75f;
        System.out.println(numFloat);
        double numDouble = 19.99d;
        System.out.println(numDouble + "\n");
        //boolean
        System.out.println("Boolean Types");
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        System.out.println(trueBoolean);
        System.out.println(falseBoolean + "\n");
        //characters
        System.out.println("Character Type");
        char grade = 'B';
        System.out.println(grade);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3 + "\n");
        //string
        System.out.println("String Type");
        String name = "Reza Kurniawan";
        System.out.println(name);

        System.out.println("----------------------");
        String processor = "Intel CORE i7";
        char currency = '$';
        byte stock = 10;
        float price = 9.99f;
        float total = stock*price;

        System.out.println("Name of Processor   = " + processor);
        System.out.println("Stock Processor     = "  + stock  );
        System.out.println("Price Processor     = " + currency + price);
        System.out.println("Total Amount        = " + currency + total) ;

        System.out.println("----------------------");
  


    }
}