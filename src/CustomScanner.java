import java.util.Scanner;

public class CustomScanner {
  /*  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosze podaj imie");

        String name = scanner.nextLine();
        System.out.println("Czesc" + " " + name);
    }
} */

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe ");
        int firstNumber = scanner.nextInt();
        System.out.println("Twoja liczba: " + " " + firstNumber);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner1.nextLine();
        System.out.println("Twoje nazwisko to: " + " " + nazwisko);*/

       /* Scanner cenaPanela = new Scanner(System.in);
        System.out.println("Podaj cene panela");
        double cena = cenaPanela.nextInt() * 0.7 + 180;
        System.out.println("Twoja cena panela po rabacie i z transportem to: " + " " + cena);*/

        Scanner wiek = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int wiek1 = wiek.nextInt();
        if (wiek1 >= 18) {
            System.out.println("Jestes pelnoletni !");
        } else if (wiek1 <= 18) {
            System.out.println("Jestes maloletni !");
        }
    }
}







