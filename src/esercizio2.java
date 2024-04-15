import java.util.Arrays;
import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci 3 stringhe: ");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        String[] boh2 = new String[]{a, b, c};

        printAndReverse(boh2);


    }


    public static void printAndReverse(String[] input) {
        String[] output = new String[input.length];
        String[] reverseOutput = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
            reverseOutput[i] = input[input.length - 1 - i];
        }

        System.out.println("Le tue stringhe in ordine originale: " + Arrays.toString(output));
        System.out.println("Le tue stringhe in ordine inverso: " + Arrays.toString(reverseOutput));
    }


}
