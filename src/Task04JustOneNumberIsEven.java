public class Task04JustOneNumberIsEven {
    public static void main(String[] args) {

        int a, b, c;

        a = InputOutput.input("Input number a: ");
        b = InputOutput.input("Input number b: ");
        c = InputOutput.input("Input number c: ");

        String msg = EvenNumber.evenNumbersCount(a, b, c) > 0 ? "There is at least one even number here."
                : "There is no even numbers here. ";

        InputOutput.output(msg);

    }
}
