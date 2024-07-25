public class strings {
    public static void main(String[] args) {
        System.out.println("Java String");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Length of the txt string is : " + txt.length()); // output : 26 (return length of a string)

        txt = "Hello World";
        // make upper and lower case
        System.out.println(txt.toUpperCase()); // output HELLO WORLD
        System.out.println(txt.toLowerCase()); // output hello world

        System.out.println("\nConcatenation");
        String firstName = "Reza";
        String lastName = "Kurniawan";
        System.out.println(firstName + " " + lastName);
        //or
        System.out.println(firstName.concat(lastName));

        System.out.println("\nNumbers and Strings");

        System.out.println("number + number");
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z); //output 30 (integer)
        System.out.println("string + string");
        String a = "10";
        String b = "20";
        String c = a + b; 
        System.out.println(c); //output 1020 (string)
        System.out.println("string + int");
        String test1 = a + x;
        System.out.println(test1); //output 1020 (string)

        System.out.println("\nEscape Characters");
        /*
         * \'   = single quote
         * \"   = double quote
         * \\   = backslash
         */

        String txt2 = "My name is \"Reza Kurniawan.\"";
        System.out.println(txt2);
        String txt3 = "it\'s alright.";
        System.out.println( txt3);
        System.out.println("The character \\ is called backslash.");
        
    }
}
