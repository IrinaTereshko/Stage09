public class EvenNumber {

    public static boolean EvenNumber(int a) {

        return (a % 2 == 0);
    }

    public static int evenNumbersCount(int a, int b, int c) {
        int countEvenNumbers = 0;

        if (a % 2 == 0) countEvenNumbers += 1;
        if (b % 2 == 0) countEvenNumbers += 1;
        if (c % 2 == 0) countEvenNumbers += 1;
        return countEvenNumbers;
    }


}

