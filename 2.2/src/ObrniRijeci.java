import java.util.Scanner;

public class ObrniRijeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite recenicu:");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }

        String result = sb.toString().trim();

        System.out.println(result);
    }
}
