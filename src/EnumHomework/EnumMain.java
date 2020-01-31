package EnumHomework;

public class EnumMain {
    public static void main(String[] args) {
        // Printing all tasks
        EnumMonthsService.printHolidaysOfMonth(EnumMonths.April);
        EnumMonthsService.printNumberOfDaysInMonth(EnumMonths.March);
        EnumMonthsService.printAllMonths(EnumMonths.values());
        System.out.println(EnumMonthsService.checkWhetherDayIsHoliday(8, EnumMonths.March));
        System.out.println(EnumMonthsService.checkWhetherDayIsHoliday(21, EnumMonths.March));

    }
}
