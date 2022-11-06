import java.util.Scanner;

public class PracaDomowa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2 = scanner.nextInt();
        int suma = liczba1 + liczba2;
        int roznica = liczba1 - liczba2;
        int iloczyn = liczba1 * liczba2;
        double iloraz = liczba1 / liczba2;
        int modulo = liczba1 % liczba2;

        System.out.println("Suma liczb wynosi: " + " " + suma);
        System.out.println("Roznica liczb wynosi: " + " " + roznica);
        System.out.println("Iloczyn liczb wynosi: " + " " + iloczyn);
        System.out.println("Iloraz liczb wynosi: " + " " + iloraz);
        System.out.println("Modulo liczb wynosi: " + " " + modulo);

    }
}
