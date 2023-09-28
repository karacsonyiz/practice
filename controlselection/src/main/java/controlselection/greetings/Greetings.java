package controlselection.greetings;

public class Greetings {

    public String greet(int hour,int minute){

        String greet = "";

        int timeInMinutes = (hour * 60) + minute;

        switch (timeInMinutes) {
            case 540:
                greet = "jó reggelt";
                break;
            case 1110:
                greet = "jó napot";
                break;
            case 1200:
                greet = "jó estét";
                break;
            case 1201:
                greet = "jó éjt";
                break;
        }
        return greet;



    }
}
