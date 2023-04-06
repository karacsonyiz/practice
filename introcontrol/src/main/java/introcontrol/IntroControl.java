package introcontrol;

public class IntroControl {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThanTen(7));
        System.out.println(introControl.substractTenIfGreaterThanTen(16));
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));
        System.out.println(introControl.greetingJoe("Joe"));
        System.out.println(introControl.greetingJoe("Jack"));
        System.out.println(introControl.calculateBonus(500_000));
        System.out.println(introControl.calculateBonus(1_500_000));
        System.out.println(introControl.calculateMeterReadingsDifference(400,600));
        System.out.println(introControl.calculateMeterReadingsDifference(400,200));
        introControl.printNumbers(10);
        introControl.printNumbersBetween(5,15);
        introControl.printNumbersBetweenAnyDirection(5,15);
        introControl.printNumbersBetweenAnyDirection(15,5);
        introControl.printOddNumbers(14);
        introControl.printOddNumbers(15);
    }

    public int substractTenIfGreaterThanTen(int n){
        if(n<=10){
            return n;
        } else {
            return n-10;
        }
    }

    public String describeNumber(int n){
        if(n == 0){
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingJoe(String name){
        if(name.equals("Joe")){
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateBonus(int i){
        if(i > 1_000_000){
            return (i/10);
        } else {
            return 0;
        }
    }

    public int calculateMeterReadingsDifference(int prev,int next){
        if(prev > next){
            return (1000-prev)+next;
        }
        return next - prev;
    }

    public void printNumbers(int max){
        for(int i = 0;i < max+1;i++){
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max){
        for(int i = min+1;i < max;i++){
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int min,int max){
        if(min > max){
            for(int i = min-1;i > max;i--){
                System.out.println(i);
            }
        } else {
            for(int i = min+1;i < max;i++){
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max){
        for(int i = 1;i < max+1;i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
