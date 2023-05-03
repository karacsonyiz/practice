package methodoverloading;

public class Time {

    private int seconds;
    private int minutes;
    private int hours;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.seconds = time.getSeconds();
        this.minutes = time.getMinutes();
        this.hours = time.getHours();
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public boolean isEqual(Time time) {
        return this.seconds == time.getSeconds() && this.minutes == time.getMinutes() && this.hours == time.getHours();
    }
    public boolean isEqual(int hours, int minutes, int seconds) {
        return this.seconds == seconds && this.minutes == minutes && this.hours == hours;
    }
    public boolean isEarlier(Time time) {
        int timeInSeconds = this.getSeconds() + (this.getMinutes() * 60) + (this.getHours() * 60 * 60);
        int paramTimeInSeconds = time.getSeconds() + (time.getMinutes() * 60) + (time.getHours() * 60 * 60);
        return paramTimeInSeconds > timeInSeconds;

    }
    public boolean isEarlier(int hours, int minutes, int seconds) {
        int timeInSeconds = this.getSeconds() + (this.getMinutes() * 60) + (this.getHours() * 60 * 60);
        int paramTimeInSeconds = seconds + (minutes * 60) + (hours * 60 * 60);
        return paramTimeInSeconds > timeInSeconds;
    }
}
