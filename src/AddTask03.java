public class AddTask03 {

    public static void main(String[] args) {

        int month, day;
        do {
            month = InputOutput.input(" Input month number : ");
            day = InputOutput.input(" Input day number: ");
            if (notExistDate(day, month)) InputOutput.output("Not existing date. Please, try again. \n");
        }
        while (notExistDate(day, month));

        InputOutput.output(countWeekDayOf2022Ear(day, month));
    }

    public static boolean notExistDate(int day, int month) {
        boolean result = (day < 1 || day > 31 || month < 1 || month > 12 ||
                ((month == 4 || month == 6 || month == 9 || month == 11) & day > 30)
                || (month == 2 & day > 28));
        return result;
    }

    public static String countWeekDayOf2022Ear(int day, int month) {

        int monthCode;
        switch (month) {
            case 1:
            case 10:
                monthCode = 1;
                break;
            case 2:
            case 3:
            case 11:
                monthCode = 4;
                break;
            case 4:
            case 7:
                monthCode = 0;
                break;
            case 5:
                monthCode = 2;
                break;
            case 6:
                monthCode = 5;
                break;
            default: // 09, 12 month
                monthCode = 6;
        }

        int year2022Code = (6 + 22 + 22 / 4) % 7;
        int weekDay = (day + monthCode + year2022Code) % 7;

        String result;

        switch (weekDay) {
            case 0:
                result = "Saturday";
                break;
            case 1:
                result = "Sunday";
                break;
            case 2:
                result = "Monday";
                break;
            case 3:
                result = "Tuesday";
                break;
            case 4:
                result = "Wednesday";
                break;
            case 5:
                result = "Thursday";
                break;
            default:
                result = "Friday";
        }
        return result;
    }
}
