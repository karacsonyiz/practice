package arrayofarrays;

import java.util.Arrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();
        int [][] result = arrayOfArraysMain.multiplicationTable(5);
        System.out.println(Arrays.deepToString(result));
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
}
