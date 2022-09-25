public class Task03ThreeEvenNumbers {
    public static void main(String[] args) {

        int a, b, c;

        a = InputOutput.input("Input number a: ");
        b = InputOutput.input("Input number b: ");
        c = InputOutput.input("Input number c: ");

        String msg = EvenNumber.evenNumbersCount(a, b, c) == 3 ?
                "All the numbers are even." : "Not all the numbers are even.";
        InputOutput.output(msg);

    }
}
