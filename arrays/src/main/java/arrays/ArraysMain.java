package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.daysOfWeek());
        System.out.println(arraysMain.multiplicationTableAsString(3));
        System.out.println(arraysMain.sameTempValues(new double[]{1.4,2,3.1},new double[]{1,2,3}));
        System.out.println(arraysMain.sameTempValues(new double[]{1.4,2,3.1},new double[]{1.4,2,3.1}));
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{5,4,3,2,1};
        System.out.println(arraysMain.wonLottery(a,b));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

    public String numberOfDaysAsString(){
        int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek(){
        return Arrays.asList("Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat","Vasárnap");
    }

    public String multiplicationTableAsString(int size){
        int[][] table = new int[size][size];
        for(int i = 0;i < size;i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day,double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }

    public boolean wonLottery(int[] a,int[] b){
        int [] a1 = Arrays.copyOf(a,a.length);
        int [] b1 = Arrays.copyOf(b,b.length);
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1,b1);
    }
}
