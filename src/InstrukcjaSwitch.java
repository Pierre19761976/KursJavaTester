import java.util.Scanner;

public class InstrukcjaSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj danie");

        String danie = scanner.nextLine();

        switch (danie) {
            case "Pizza" :
                System.out.println("Cena to 22 zl");
                break;

            case "Kebab" :
                System.out.println("Cena to 35 zl");
                break;
            case "Frytki" :
                System.out.println("Cena to 40 zl");
                break;
            default:
                System.out.println("Nie mamy takiego dania !");

        }
    }
}
