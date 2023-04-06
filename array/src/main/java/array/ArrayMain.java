package array;

public class ArrayMain {

    public static void main(String[] args) {
        String [] weekDays = {"Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat","Vasárnap"};
        System.out.println(weekDays[1]);
        System.out.println(weekDays.length);

        int [] powersOfTwo = new int[5];

        for(int i = 0;i< powersOfTwo.length;i++){
            powersOfTwo[i] = (int) Math.pow(2,i);
            System.out.println(powersOfTwo[i]);
        }

        boolean [] bools = new boolean[6];

        for(int i = 0;i <bools.length;i++){
            if(i % 2 == 1){
                bools[i] = true;
            }
            System.out.println(bools[i]);
        }


    }
}
