public class N {
    public static void main(String[] args) {
        int number = 10; // Change this number to the desired limit

        System.out.println("Odd numbers between 1 and " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

