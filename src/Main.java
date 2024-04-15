import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int x = scanner.nextInt();

        System.out.println("Inserisci un altro numero per cui moltiplicare il primo: ");
        int y = scanner.nextInt();

        System.out.println("Il risultato della moltiplicazione è: " + multiply(x, y));

        scanner.nextLine();

        System.out.println("Inserisci una stringa: ");
        String s = scanner.nextLine();

        System.out.println("Inserisci un numero da concatenare alla stringa: ");
        int q = scanner.nextInt();

        System.out.println("Il risultato è: " + concat(s, q));

        scanner.nextLine();

        System.out.println("Inserisci 6 stringhe: ");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String d = scanner.nextLine();
        String e = scanner.nextLine();
        String f = scanner.nextLine();

        String[] boh = insertToArray(new String[]{a, b, c, d, e}, f);

        System.out.println(Arrays.toString(boh));





    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static String concat (String a, int b) {
        return a + b;
    }

    public static String[] insertToArray (String[] array, String a) {

        String[] newArray = new String[array.length + 1];
        newArray[0] = array[0];
        newArray[1] = array[1];
        newArray[2] = a;
        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }

}