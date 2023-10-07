package controlselection.month;

public class DayInMonth {

    public int numberOfDays(int year,String montharg){
        Month found = null;
        for (Month month : Month.values()) {
            if (month.name().equalsIgnoreCase(montharg)) {
                found = month;
                break;
            }
        }
        if(found == null){
            throw new IllegalArgumentException();
        }
        if(found.name().equals("február")){
            found.isLeapYear(year);
        }
        return found.getNumberOfdays();
    }


}
