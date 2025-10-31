// Issue: https://github.com/Seed-Pursuit/Hacktoberfest-2025-DSA/issues/18
// Problem: Rotate Array by K Positions
// Author: Karthika Krishnan
// Approach: Reverse-based rotation (O(n) time, O(1) extra space)

package DSA;

import java.util.*;

public class RotateArrayByK {

    
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        
        k = k % n;
        if (k == 0) return;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rotate(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
