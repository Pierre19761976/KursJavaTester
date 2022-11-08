public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && i
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
       // || lub

        System.out.println(firstValue || secondValue);

        // ! zaprzeczenie

        System.out.println(firstValue && !secondValue);
        System.out.println(!(firstValue&&secondValue));
        boolean fifthValvue = 2 < 1;
        System.out.println(fifthValvue);

    }
}
