//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // prolazimo kroz sve brojeve od 1 do 9999
        for (int broj = 1; broj <= 9999; broj++) {
            if (jeArmstrong(broj)) {
                System.out.println(broj);
            }
        }
    }

    // metoda koja provjerava je li broj Armstrongov
    private static boolean jeArmstrong(int broj) {
        int original = broj;
        int suma = 0;

        // broj znamenki
        int znamenke = String.valueOf(broj).length();

        // razbijanje broja na znamenke i računanje sume potencija
        while (broj > 0) {
            int znamenka = broj % 10;
            suma += Math.pow(znamenka, znamenke);
            broj /= 10;

        }
        return suma == original;
    }
}