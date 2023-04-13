package enumtype.week;

public enum Day {
    MONDAY(DayType.WORKDAY),
    TUESDAY(DayType.WORKDAY),
    WEDNESDAY(DayType.WORKDAY),
    THURSDAY(DayType.WORKDAY),
    FRIDAY(DayType.WORKDAY),
    SATURDAY(DayType.HOLIDAY),
    SUNDAY(DayType.HOLIDAY);

    private final DayType type;

    Day(DayType type) {
        this.type = type;
    }

    public DayType getType() {
        return type;
    }
}
