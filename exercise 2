package question.pkg2;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();  }
        System.out.print("Array without duplicates: ");
        for(int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;} }
            if (!duplicate) {
                System.out.print(arr[i] + " "); }}
        System.out.println();
    }
    
}
