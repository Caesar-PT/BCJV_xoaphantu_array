import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] arr = {3, 9, 7, 5, 4, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào phần tử cần xóa");
        int x = scanner.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index_del = i;
            }
        }
       for (int j = index_del; j < arr.length - 1; j++){
           arr[j] = arr[j+1];
       }
        System.out.println(Arrays.toString(arr));
        
    }
}
