package defaultconstructor.date;

import java.util.HashMap;
import java.util.Map;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day){
        if(month == 2 && !isLeapYear(year)){
            throw new IllegalArgumentException("One or more given parameter cannot be applied!");
        }
        if(month > 12 || year <= 1900){
            throw new IllegalArgumentException("One or more given parameter cannot be applied!");
        }
        isDayCorrect(month,day);

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private void isDayCorrect(int month,int day){
        Map<Integer,Integer> monthDays = new HashMap<>();
        monthDays.put(1,31);
        monthDays.put(2,29);
        monthDays.put(3,31);
        monthDays.put(4,30);
        monthDays.put(5,31);
        monthDays.put(6,30);
        monthDays.put(7,31);
        monthDays.put(8,31);
        monthDays.put(9,30);
        monthDays.put(10,31);
        monthDays.put(11,30);
        monthDays.put(12,31);

        int m = monthDays.get(month);

        if(m != day){
            throw new IllegalArgumentException("One or more given parameter cannot be applied!");
        }
    }



    public boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
