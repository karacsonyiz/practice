package controlselection.month;

public enum Month {

    január(31),
    február(28),
    március(31),
    április(30),
    május(31),
    június(30),
    július(31),
    augusztus(31),
    szeptember(30),
    október(31),
    november(30),
    december(31);

    private int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            február.days = 29;
        } else {
            február.days = 28;
        }
    }
}



