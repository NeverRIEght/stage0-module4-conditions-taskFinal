package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 && month < 1 && month > 12) {
            System.out.println("invalid date");
        } else {
            Boolean isLeapYear;

            switch (year) {
                case 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600:
                    isLeapYear = false;
                    break;
                default:
                    isLeapYear = year % 4 == 0 ? true : false;
            }
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 ->
                        System.out.println(31);
                case 4, 6, 9, 11 ->
                        System.out.println(30);
                case 2 -> {
                    System.out.println(!isLeapYear ? 28 : 29);
                }
                default -> System.out.println("invalid date");
            }
        }
    }
}
