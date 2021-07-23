package com.guilherme.cursojava.aula85_100.classes_utilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

    public static void main(String[] args) {

        Calendar today1 = Calendar.getInstance();

        GregorianCalendar today = new GregorianCalendar();

        //System.out.println(hoje);
        printData(today);

        System.out.println(today.isLeapYear(2020));

        GregorianCalendar today2 = new GregorianCalendar(2017, 0, 1);

        printData(today2);

        GregorianCalendar today3 = new GregorianCalendar(2017, 0, 1, 14, 30, 23);

        printData(today3);

    }

    private static void printData(Calendar hoje) {

        int year = hoje.get(Calendar.YEAR);
        int month = hoje.get(Calendar.MONTH);
        int day = hoje.get(Calendar.DAY_OF_MONTH);
        int hour = hoje.get(Calendar.HOUR_OF_DAY);
        int minutes = hoje.get(Calendar.MINUTE);
        int seconds = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d",
                day, (month + 1), year, hour, minutes, seconds);

        System.out.println();
    }

}
