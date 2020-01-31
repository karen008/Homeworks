package EnumHomework;


import java.util.Arrays;

public class EnumMonthsService {

    public static void printHolidaysOfMonth(EnumMonths month) {
        if (month == null) {
            return;
        }
        System.out.println("holidays in " + month.name() + " are " + Arrays.toString(month.getDaysOfPublicHolidays()));
        System.out.println();
    }

    public static void printNumberOfDaysInMonth(EnumMonths month) {
        if (month == null) {
            return;
        }
        System.out.println(month.getNumberOfDays());
        System.out.println();
    }

    public static void printAllMonths(EnumMonths[] months) {
        if (months == null) {
            return;
        }
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println();
    }

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
