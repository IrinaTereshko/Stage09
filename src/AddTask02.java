public class AddTask02 {

    public static final int MINUTES_IN_ONE_HOUr = 60;
    public static final int SECONDS_IN_ONE_MINUTE = 60;

    public static void main(String[] args) {

        InputOutput.output("What time is it now? \n");

        int hour, minute;

        do {
            hour = InputOutput.input("Please, input hours in 24H format: ");
            minute = InputOutput.input("Please, input minutes: ");
            if (hour < 0 | hour > 24 | minute < 0 | minute > 59)
                InputOutput.output("Not existing time. Please, repeat input.");
        } while (hour < 0 | hour > 23 | minute < 0 | minute > 59);


        String resultMinutesPassed = countMinutesElapsed(hour, minute) + " minutes have passed in this day.";
        String resultSecondsPassed = countSecondsElapsed(hour, minute) + " seconds have passed in this day.";

        InputOutput.output(resultMinutesPassed);
        InputOutput.output(resultSecondsPassed);

    }

    public static int countMinutesElapsed(int hour, int minute) {
        return (MINUTES_IN_ONE_HOUr * hour + minute);

    }

    public static int countSecondsElapsed(int hour, int minute) {
        return (MINUTES_IN_ONE_HOUr * hour + SECONDS_IN_ONE_MINUTE * minute);

    }

}
