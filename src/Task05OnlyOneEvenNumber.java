public class Task05OnlyOneEvenNumber {
    public static void main(String[] args) {

        int a, b, c;

        a = InputOutput.input("Input number a: ");
        b = InputOutput.input("Input number b: ");
        c = InputOutput.input("Input number c: ");

        String msg = EvenNumber.evenNumbersCount(a, b, c) == 1 ?
                "There is only one even number here." : "False";

        InputOutput.output(msg);

    }
}
