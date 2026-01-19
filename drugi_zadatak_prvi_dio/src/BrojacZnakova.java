//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class BrojacZnakova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite string: ");
        String s = sc.nextLine();

        int slova = 0;
        int brojevi = 0;
        int ostali = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                slova++;
            } else if (Character.isDigit(c)) {
                brojevi++;
            } else {
                ostali++;
            }
        }

        System.out.printf("Slova: %d%n", slova);
        System.out.printf("Brojevi: %d%n", brojevi);
        System.out.printf("Ostali znakovi: %d%n", ostali);
    }
}
