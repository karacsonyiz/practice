package defaultconstructor.date;

public class SimpleDateFormatter {

    public String formatDateString(SimpleDate simpleDate){
        return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){

        StringBuilder sb = new StringBuilder();
        String year = Integer.toString(simpleDate.getYear());
        String month = Integer.toString(simpleDate.getMonth());
        String day = Integer.toString(simpleDate.getDay());

        switch (countryCode) {
            case HU:
                sb.append(year).append("-").append(month).append("-").append(day);
                break;
            case EN:
                sb.append(day).append("-").append(month).append("-").append(year);
                break;
            case US:
                sb.append(month).append("-").append(day).append("-").append(year);
                break;
        }
        return sb.toString();
    }

}
