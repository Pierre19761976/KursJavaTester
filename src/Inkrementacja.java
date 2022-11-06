public class Inkrementacja {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartosc a: " + a);
        int b = a++;
        System.out.println("Wartosc b: " + b); //0
        System.out.println("Wartosc a: " + a); //1
       int c = ++a;
        //int c = a++;
        System.out.println("Wartosc c: " + c); //2
        System.out.println("Wartosc a: " + a); //2
        // pre najpierw zwikekszamy wartosc a a poźniej przypuszemy ja do
        // post najpierw przypisujemy wartosc a do c a pozniej zwiekszamy wartosc a
        int d = ++a;
        System.out.println("Wartosc d: " + d);
        System.out.println("Wartosc a: " + a); //3

        int e = --a;
        System.out.println("Wartosc e : " + e ); //3
        System.out.println("Wartosc a: " + a); //2

        int g = a--;
        System.out.println("Wartosc g : " + g ); //
        System.out.println("Wartosc a: " + a); //1






    }
}
