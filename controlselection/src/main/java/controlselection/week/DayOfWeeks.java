package controlselection.week;

public class DayOfWeeks {

    public String whichDay(String day) {
        String typeOfDay;
        switch (day.toUpperCase()) {
            case "HÉTFŐ":
                typeOfDay = "hét eleje";
                break;
            case "KEDD":
            case "SZERDA":
            case "CSÜTÖRTÖK":
                typeOfDay = "hét közepe";
                break;
            case "PÉNTEK":
                typeOfDay = "majdnem hétvége";
                break;
            case "SZOMBAT":
            case "VASÁRNAP":
                typeOfDay = "hét vége";
                break;
            default:
                throw new IllegalArgumentException("Unknown day");
        }
        return typeOfDay;
    }
};
