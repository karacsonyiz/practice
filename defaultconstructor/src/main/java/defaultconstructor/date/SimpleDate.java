package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day){
        if(month == 2 && !isLeapYear(year)){
            throw new IllegalArgumentException("One or more given parameter cannot be applied!");
        }
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



    public boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
