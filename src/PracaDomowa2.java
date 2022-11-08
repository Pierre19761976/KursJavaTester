import java.util.Scanner;

public class PracaDomowa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj swoj wiek");
        int age = scanner.nextInt();
         if(age < 18 && age >=0) {
            System.out.println("Nie mozesz kupic alkoholu !");
        }
        else if (age >= 18) {
            System.out.println("Dziekujemy za zakupy !");

        } else if (age < 0){
                System.out.println("Wprowadz poprawna wartosc !!!!!");
            }
        }
    }

