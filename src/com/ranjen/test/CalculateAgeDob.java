package com.ranjen.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;



public class CalculateAgeDob {
    public static void main(String[]args) throws ParseException {
        String ageString = "400617075823";
        System.out.println(calculateAge(ageString));
        System.out.println(getDob(ageString));
    }


    private static String getDob(String ageString){
        LocalDate today = LocalDate.now(); //Today's date
        //string to date
        //TO DO will give 91 need to change to 1991
        DateFormat sdfp = new SimpleDateFormat("yy");
        Date d = null;
        try {
            d = sdfp.parse(ageString.substring(0,2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat sdff = new SimpleDateFormat("yyyy");
        String yearString = sdff.format(d);
        int year = Integer.parseInt(yearString);
        //TO DO will give 02 need to change 2
        int month = Integer.parseInt(removeZerosInfront(ageString.substring(3,4)));
        //TO DO give 01 need to change 1
        int day = Integer.parseInt(removeZerosInfront(ageString.substring(4,6)));
        LocalDate birthday = LocalDate.of(year, Month.of(month), day);  //Birth date
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(birthday);
    }

    private static int calculateAge(String ageString){
        LocalDate today = LocalDate.now(); //Today's date
        //string to date
        //TO DO will give 91 need to change to 1991
        DateFormat sdfp = new SimpleDateFormat("yy");
        Date d = null;
        try {
            d = sdfp.parse(ageString.substring(0,2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat sdff = new SimpleDateFormat("yyyy");
        String yearString = sdff.format(d);
        int year = Integer.parseInt(yearString);
        //TO DO will give 02 need to change 2
        int month = Integer.parseInt(removeZerosInfront(ageString.substring(3,4)));
        //TO DO give 01 need to change 1
        int day = Integer.parseInt(removeZerosInfront(ageString.substring(4,6)));
        LocalDate birthday = LocalDate.of(year, Month.of(month), day);  //Birth date
        Period p = Period.between(birthday, today);
        int age = p.getYears();
        return age;
    }

    private static String removeZerosInfront(String str){
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "");
        return sb.toString();
    }
}
