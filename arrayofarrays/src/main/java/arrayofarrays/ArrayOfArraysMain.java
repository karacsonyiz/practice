package arrayofarrays;

import java.time.LocalDate;
import java.util.Arrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();
        int [][] result = arrayOfArraysMain.multiplicationTable(3);
        arrayOfArraysMain.printArrayOfArrays(result);
        System.out.println(Arrays.deepToString(result));
        arrayOfArraysMain.triangularMatrix(3);
        System.out.println(Arrays.deepToString(arrayOfArraysMain.getValues()));
    }

    public int[][] multiplicationTable(int size){
        int[][] table = new int[size][size];
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                table[i][j] = (i+1)*(j+1);
            }
        }
        return table;
    }

    public void printArrayOfArrays(int[][] a){
       for(int i=0;i<a.length;i++){
           for(int j = 0;j<a.length;j++){
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
       }
    }

    public int[][] triangularMatrix(int size){
        int [][] arr = new int[size+1][];
        for(int i = 0;i < size+1;i++){
            arr[i] = new int[i+1];
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = i;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    public int[][] getValues(){
        int [][] months = new int[12][];
        for(int i = 0;i < 12;i++){
            LocalDate localDate = LocalDate.of(1994, i+1, 15);
            System.out.println(localDate.lengthOfMonth());
            months[i] = new int[localDate.lengthOfMonth()];
        }
        return months;
    }
}
