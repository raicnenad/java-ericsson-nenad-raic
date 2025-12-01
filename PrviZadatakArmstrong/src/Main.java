public class Main {
    public static void main(String[] args) {


        System.out.println("Hello and welcome!");
        System.out.println("Hello and welcome1!");

        // prolazimo kroz sve brojeve od 1 do 20000
        int limit = 20000; // You can change this value if needed

        if (limit < 1) {
            System.out.println("Limit must be greater than zero.");
            return;
        }

        System.out.println("Armstrong numbers between 1 and " + limit + " are:");

        for (int num = 1; num <= limit; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // metoda koja provjerava je li broj Armstrongov
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        // broj znamenki
        int digits = String.valueOf(number).length();

        // razbijanje broja na znamenke i računanje sume potencija
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;

        }
        return sum == original;
    }
}
