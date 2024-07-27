import java.util.Arrays;

public class multidimensionalArray {
    public static void main(String[] args) {
        int [][] myNum = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Value from index row = 1 and index coloumn = 2 is " + myNum[1][2]); //output 6
        
        //Loop
        System.out.println();
        System.out.println("Loop multidimensional");
        for (int i = 0; i < myNum.length; ++i) {
            for (int j = 0; j < myNum[i].length; ++j ) {
                System.out.println(myNum[i][j]);
            }
        }

        System.out.println();
        for (int [] row : myNum) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        for (int [] row : myNum) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
