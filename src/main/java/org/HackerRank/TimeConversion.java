package org.HackerRank;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String timeConversion(String s) {

        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);

        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0, secPeriod.length()-2);
        String period = str[2].substring(secPeriod.length()-2, secPeriod.length());

        String newTimeINString = "";

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeINString = (12 + hour) + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = "00" + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeINString = hour + ":" + min + ":" + sec;
        }
        return newTimeINString;
    }
}

class TimeConversionRunner {

    public static void main(String[] args) {

        System.out.println(TimeConversion.timeConversion("07:01:00PM"));
    }
}
