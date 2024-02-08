package org.Enum;

enum DaysOfWeek {

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        // Write your code here to return the name of the day
        return name;
    }

    public boolean isWeekday() {
        // Write your code here to check if this day is a weekday
        return this != SATURDAY && this != SUNDAY;  //retorno de uma forma diferente
    }

    public boolean isHoliday() {
        // Write your code here to check if this day is a holiday
        switch (this){
            case SATURDAY:
            case SUNDAY:
                return true;
        }
        return false;
    }
}

class DaysOfWeekRunner {
    public static void main(String[] args) {

        System.out.println(DaysOfWeek.FRIDAY.isWeekday());
    }
}

