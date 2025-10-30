import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,5,3,6,7};
        int length = arr.length;
        int[] reversedArr = new int[length];
        for(int i=0; i<length; i++){
            reversedArr[i] = arr[length-1-i];
        }
        System.out.println(Arrays.toString(reversedArr));
    }
}
