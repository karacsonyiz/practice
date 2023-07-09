package course;

public class SimpleTime {

    private int hour;
    private int minute;
    private String timeString;

    public SimpleTime(int hour, int minute) {
        checkTime(hour,minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String timeString) {
        if(timeString == null) {
            throw new InvalidTimeException("Time is null");
        }
        checkTimeSTring(timeString);
        this.timeString = timeString;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        if(timeString != null){
            return timeString;
        }
        String hourString = Integer.toString(hour);
        String minuteString = Integer.toString(minute);

        if(hour < 10) {
            hourString = "0" + hourString;
        }
        if(minute < 10) {
            minuteString = "0" + minuteString;
        }
        return hourString + ":" + minuteString;
    }

    private void checkTime(int hour,int minute){
        if(hour > 23 || hour < 0) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if(minute > 59 || minute < 0) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    private void checkTimeSTring(String timeString) {
        String[] charArr = timeString.split("");
        if(charArr.length != 5 || !charArr[2].equals(":")) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        try {
            String timeStringWithoutColon = timeString.replace(":","");
            Integer.parseInt(timeStringWithoutColon);
        } catch (NumberFormatException e) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        checkTime(Integer.parseInt(charArr[0] + charArr[1]),Integer.parseInt(charArr[3] + charArr[4]));
        this.hour = Integer.parseInt(charArr[0] + charArr[1]);
        this.minute = Integer.parseInt(charArr[3] + charArr[4]);
    }


}
