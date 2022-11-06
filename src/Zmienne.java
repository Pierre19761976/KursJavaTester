public class Zmienne {

    String name;
    String name1 = "Piotr";

    public static void main(String[] args) {
        String name1 = "Piotr";
        int liczba = 1;
        int liczba1 = 2;
        int wynik = liczba + liczba1;
        System.out.println(name1);
        System.out.println(wynik);

        name1 = "Kasia"; //nadpisanie zmiennej
        System.out.println(name1);

        int liczba2, liczba3, liczba4;
        liczba2 = 4;
        liczba3 = 5;
        liczba4 = 6;
        int wynik2 = liczba2 + liczba3 + liczba4;
        System.out.println(wynik2);


    }
}