public class Task01Palindrome {

    public static void main(String[] args) {

        int number = InputOutput.input(" Input your 4 digits number: ");
        int a, b, c, d;


        a = number % 10;
        number /= 10;
        b = number % 10;
        number /= 10;
        c = number % 10;
        d = number / 10;

        String result = (a == d & b == c) ? "This number is a palindrome." : "This number is not a palindrome.";

        InputOutput.output(result);


    }
}
