package code;

/**
 * LeetCode Easy questions 88. Merge Sorted Array.
 * 
 * @author sanghunlee
 *
 */
public class MergeSortedArray {
  /**
   * algorithm to sort out the two integer arrays merge and sorted.
   * 
   * @param nums1 integer of array 1.
   * @param m number of element initialised in nums1.
   * @param nums2 integer of array 2.
   * @param n number of element initialised in nums2.
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int l = m + n - 1;
    m--;
    n--;
    while (m >= 0 && n >= 0) {
      if (nums1[m] > nums2[n]) {
        nums1[l] = nums1[m];
        l--;
        m--;
      } else {
        nums1[l] = nums2[n];
        l--;
        n--;
      }
    }
    for (int i = 0; i <= n; i++) {
      nums1[i] = nums2[i];
    }
  }

  /**
   * main method to run the method.
   * 
   * @param args
   */
  public static void main(String[] args) {
    MergeSortedArray test = new MergeSortedArray();
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;
    test.merge(nums1, m, nums2, n);

  }

}
