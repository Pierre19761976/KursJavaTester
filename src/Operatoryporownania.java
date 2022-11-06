import java.util.Scanner;

public class Operatoryporownania {
    public static void main(String[] args) {
       //porownuja elementy rownania i zwracaja wartosc
       // logiczna w postaci tru lub false

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj liczbe b");
        int secondNumber = scanner.nextInt();

        System.out.println("a > b : " + (firstNumber > secondNumber));
        System.out.println("a < b : " + (firstNumber < secondNumber));
        System.out.println("a >= b : " + (firstNumber >= secondNumber));
        System.out.println("a <= b : " + (firstNumber <=secondNumber));
        System.out.println("a = b : " + (firstNumber == secondNumber));
        System.out.println("a jest rozne od b : " + (firstNumber != secondNumber));

         /*== - rowne
                != różne*/





    }
}
