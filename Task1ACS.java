
import java.util.*;

public class Task1ACS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vehicles = new int[n];
        for (int i = 0; i < n; i++) {
            vehicles[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += vehicles[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += vehicles[i];
            windowSum -= vehicles[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);

        sc.close();
    }
}
