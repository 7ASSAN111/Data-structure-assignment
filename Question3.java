package question.pkg3;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); }
        System.out.print("Enter number to remove: ");
        int key = in.nextInt();
        System.out.print("Array after removing " + key + ": ");
        for (int i = 0; i < n; i++) {
            if (arr[i] != key) {
                System.out.print(arr[i] + " "); }}
        System.out.println();
    }
    
}
