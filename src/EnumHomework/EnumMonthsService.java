package EnumHomework;


import java.util.Arrays;

public class EnumMonthsService {

    // Printing all holidays of month
    public static void printHolidaysOfMonth(EnumMonths month) {
        if (month == null) {
            return;
        }
        System.out.println("holidays in " + month.name() + " are " + Arrays.toString(month.getDaysOfPublicHolidays()));
        System.out.println();
    }

    // Printing number of days in month
    public static void printNumberOfDaysInMonth(EnumMonths month) {
        if (month == null) {
            return;
        }
        System.out.println(month.getNumberOfDays());
        System.out.println();
    }

    // Printing all months
    public static void printAllMonths(EnumMonths[] months) {
        if (months == null) {
            return;
        }
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println();
    }

    // Checking whether day is holiday
    public static boolean checkWhetherDayIsHoliday(int day, EnumMonths month) {
        if (month == null || day > 31 || day < 1) {
            return false;
        }
        for (int i = 0; i < month.getDaysOfPublicHolidays().length; i++) {
            if (month.getDaysOfPublicHolidays()[i] == day) {
                return true;
            }
        }
        return false;
    }
}
