public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplaction = firstNumber * secondNumber;
        double division = thirdNumber/secondNumber;
        int mod = firstNumber%secondNumber;

        System.out.println(" Dodawanie: " + addition);
        System.out.println(" Odejmowanie: " + substraction);
        System.out.println(" Mnożenie: " + multiplaction);
        System.out.println(" Dzielenie: " + division);
        System.out.println(" Modulo: " + mod);

        //inny sposob skrót nadpisanie wykonuje pod kolei
        //first number sie zmienia

        firstNumber+=secondNumber;
        System.out.println(firstNumber);

        firstNumber-=secondNumber;
        System.out.println(firstNumber);

        firstNumber*=secondNumber;
        System.out.println(firstNumber);










    }


}
