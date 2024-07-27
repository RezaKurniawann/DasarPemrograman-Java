public class arrays {   

    public static void main(String[] args) {
        System.out.println("Array");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Car index 0 = " + cars[0]);
        cars[0] = "Opel";
        System.out.println("Change Card index 0 with" + cars[0]);
        System.out.println("Car index 0 = " + cars[0]);

        System.out.println();
        //Array Loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println();
        // with for each
        for (String i : cars) {
            System.out.println(i);
        }

        //example search avg ages
        System.out.println();
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum/length;
        System.out.println("The Average Ages = " + avg);

        //example search the lowes age
        int lowestAge = ages[0];
        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The Lowest Age = " + lowestAge);

        




    
    }
}
