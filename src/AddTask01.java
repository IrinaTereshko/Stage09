public class AddTask01 {

    public static void main(String[] args) {

        int a = InputOutput.input("Input number a: ");
        int b = InputOutput.input("Input number b: ");
        int c = InputOutput.input("Input number c: ");


        String msg = EvenNumber.evenNumbersCount(a, b, c) > (3 - EvenNumber.evenNumbersCount(a, b, c)) ?
                "Most of the numbers are even." : "Most of the numbers are odd.";

        InputOutput.output(msg);

    }
}
