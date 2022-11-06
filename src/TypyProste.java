public class TypyProste {
    //zmienne zarezerwowane miejsce w pamiecie z okreslonym typem danych

// byte, short, int, long - stałoprzecinkowe
    // float, double,  - zmiennoprzecinkowe
    //boolen - wartosci logiczne
    // char pojedynczy znak


    public static void main(String[] args) {
        String name = "Bartek";

        int liczba = 1;
        int liczba1 = 2;
        int wynik = liczba + liczba1;

        //nadpisanie zmiennej

        name = "Kasia";

        System.out.println(name);
        System.out.println(wynik);

        //inny sposob przypisania zmiennej

        int liczba3, liczba4, liczba5;
        liczba3 = 10;
        liczba4 = 15;
        liczba5 = 20;
        wynik = liczba3 + liczba4 + liczba5;

        System.out.println(wynik);
    }


}
