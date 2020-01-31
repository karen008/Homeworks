package EnumHomework;

import java.util.Arrays;

public enum EnumMonths {
    January(31,4,new int[] {1,6,13,20}),
    February(28,6,new int[] {3,6,12,15,22,30}),
    March(31,7,new int[] {2,6,8,10,11,19,27}),
    April(30,8,new int[] {3,12,10,17,21,6,11,14}),
    May(31,3,new int[] {1,9,16}),
    June(30,4,new int[] {1,7,14,22}),
    July(31,3,new int[] {3,11,24}),
    August(31,9,new int[] {2,3,8,9,16,18,24,28,31}),
    September(30,4,new int[] {1,10,15,21}),
    October(31,8,new int[] {9,3,20,15,20,22,25,27}),
    November(30,3,new int[] {3,5,21}),
    December(31,1,new int[] {31});


    private int numberOfDays;
    private int numberOfHolidaysInMonth;
    private int[] daysOfPublicHolidays;

    EnumMonths(int numberOfDays, int numberOfHolidaysInMonth, int[] daysOfPublicHolidays) {
        this.numberOfDays = numberOfDays;
        this.numberOfHolidaysInMonth = numberOfHolidaysInMonth;
        this.daysOfPublicHolidays = daysOfPublicHolidays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfHolidaysInMonth() {
        return numberOfHolidaysInMonth;
    }

    public int[] getDaysOfPublicHolidays() {
        return daysOfPublicHolidays;
    }

    @Override
    public String toString() {
        return this.name() + " -> " +
                "numberOfDays = " + numberOfDays +
                ", numberOfHolidaysInMonth = " + numberOfHolidaysInMonth +
                ", daysOfPublicHolidays = " + Arrays.toString(daysOfPublicHolidays);
    }
}
