import java.util.Arrays;

void main() {
  int[] nums1 = new int[] {1,2,3,0,0,0};
  int[] nums2 = new int[] {4,5,6};
  merge(nums1,3,nums2,3);
}

private static void merge (int[] nums1, int m, int[] nums2, int n) {
  if(nums1.length != m + n) return;

  int p = m + n -1;
  n = n -1;
  m = m -1;


  while (m >= 0 && n >= 0) {
    if(nums1[m] > nums2[n]) {
      nums1[p--] = nums1[m--];
    } else {
      nums1[p--] = nums2[n--];
    }
  }

  System.out.println(Arrays.toString(nums1));
}