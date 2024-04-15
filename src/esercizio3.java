import java.util.Locale;
import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Inserisci le misure decimali di due lati adiacenti di un rettangolo in cm:");
        float q = scanner.nextFloat();
        float r = scanner.nextFloat();
        System.out.println("Il perimetro del rettangolo è: " + rectanglePerimeter(q, r) + " cm quadrati!");


        System.out.println("Inserisci un numero intero e vediamo se è pari o dispari:");
        int s = scanner.nextInt();
        System.out.println("Il perimetro del rettangolo è: " + oddEven(s));


        System.out.println("Inserisci le misure decimali di tre lati di un triangolo in cm:");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        System.out.println("L'area del triangolo è: " + triangleArea(x, y, z) + " cm quadrati!");

    }


    public static float rectanglePerimeter(float a, float b) {
        return (a + b) * 2;
    }

    public static int oddEven(int x) {
        if (x % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double triangleArea(float a, float b, float c) {
        float p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
