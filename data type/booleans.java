public class booleans {

    public static void main(String[] args) {
       System.out.println("Boolean");
        boolean isJavaFun = true;
       boolean isJavaBad = false;
       System.out.println(isJavaFun);
       System.out.println(isJavaBad); 

       int x = 10;
       int y = 20;
       System.out.println(x);
       System.out.println(y);
       System.out.println(x > y); //return false because y is greater than x
       System.out.println(x == 10); // retrun true because x equals 10

       int value = 80;
       if (value > 70) {
        System.out.println("true");
       } else {
        System.out.println("false");
       }
    }
}
