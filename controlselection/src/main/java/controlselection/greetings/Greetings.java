package controlselection.greetings;

public class Greetings {

    public String greet(int hour,int minute){

        String greet = "";
        int timeInMinutes = (hour * 60) + minute;

        if(timeInMinutes <= 300 || timeInMinutes > 1200){
            greet = "jó éjt";
        }

        if(timeInMinutes > 300 && timeInMinutes <= 540){
            greet = "jó reggelt";
        }

        if(timeInMinutes > 540 && timeInMinutes <= 1110){
            greet = "jó napot";
        }

        if(timeInMinutes > 1110 && timeInMinutes <= 1200){
            greet = "jó estét";
        }

        return greet;
    }
}
