import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {


        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1; i >= 0; i--) {
            if (m == 0) {
                nums1[i] = nums2[--n];
            } else if (n == 0) {
                nums1[i] = nums1[--m];
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i] = nums1[--m];
            } else {
                nums1[i] = nums2[--n];
            }
        }
    }

}
