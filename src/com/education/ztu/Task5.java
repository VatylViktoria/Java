package com.education.ztu;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task5 {
    public static void doTask(){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(2024, Calendar.MAY, 24);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.isLeapYear(calendar.get(Calendar.YEAR)));

        Date now = new Date();
        Date lab = new Date(2024, Calendar.MAY, 24);
        System.out.println(now.after(lab));
        System.out.println(now.before(lab));
        System.out.println(now);
        now.setDate(8);
        now.setHours(8);
        now.setYear(now.getYear() - 10);
        System.out.println(now);
    }
}
