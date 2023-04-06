package array;

public class ArrayHandler {

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] a = {1,2,3,4,5,6};
        int[] newArray = arrayHandler.append(a,7);
        for(int i : newArray){
            System.out.println(i);
        }
        System.out.println(arrayHandler.contains(new int[]{1,2,3,4},4));
        System.out.println(arrayHandler.contains(new int[]{1,2,3,4},9));
        System.out.println(arrayHandler.find(new int[]{1,2,3,4},4));
        System.out.println(arrayHandler.find(new int[]{1,2,3,4},9));
    }

    public int[] append(int[] source, int item){
        int [] result = new int[source.length+1];
        System.arraycopy(source,0,result,0,source.length);
        result[result.length-1] = item;
        return result;
    }

    public boolean contains(int[] source, int itemToFind){
        for(int item : source){
            if(item == itemToFind){
                return true;
            }
        }
        return false;
    }

    public int find(int[] source,int itemToFind){
        for(int item : source){
            if(item == itemToFind){
                return item;
            }
        }
        return -1;
    }
}
