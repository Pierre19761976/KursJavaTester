import java.util.Scanner;

public class InstrukcjaWarunkoaElsIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("liczba wieksza od zera");
        } else if (number < -10) {
            System.out.println("liczba mniejsza od -10");
        } else if (number == 0) {
            System.out.println("liczba rowna 0");
        } else {
            System.out.println("warunek nie spelniony");
        }
    }
}
