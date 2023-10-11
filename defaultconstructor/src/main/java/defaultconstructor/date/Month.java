package defaultconstructor.date;

public enum Month {

    január(31,1),
    február(28,2),
    március(31,3),
    április(30,4),
    május(31,5),
    június(30,6),
    július(31,7),
    augusztus(31,8),
    szeptember(30,9),
    október(31,10),
    november(30,11),
    december(31,12);

    private int days;
    private int monthAsNumber;

    Month(int days,int monthAsNumber) {
        this.days = days;
        this.monthAsNumber = monthAsNumber;
    }

    public int getNumberOfdays() {
        return days;
    }

    public int getMonthAsNumber() {
        return monthAsNumber;
    }
}
