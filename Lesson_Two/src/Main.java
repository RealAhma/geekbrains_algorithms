import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int [] arr = new int[10];
        Random number = new Random();
        for (int i = 0; i < arr.length; i ++){
            arr[i] = number.nextInt(10);
        }
        for (int a = 0; a < arr.length; a++) System.out.print(arr[a] + ", ");
    }

    public static void deleteElement(int []arr){
        int i = 0;
        int search = 7;
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                break;
            } else if(search < arr[mid]){
                    high = mid - 1;
                    continue;
                } else {
                    low = mid + 1;
                    continue;
                }
            }
        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        int a = arr.length;
        a--;
        System.out.print("Массив с удаленным элементом " + arr);
        }

    public boolean binaryFind(int []arr, int value){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if (value == arr[mid]) {
                return true;
            }
            else {
                if (value < arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }


}
