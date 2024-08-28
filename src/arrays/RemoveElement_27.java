/**
 * Условие задачи: удалить из массива все вхождения val и вернуть размер массива in-place
 * Time = O(n)
 * Space = O(1)
 */

void main() {
  int res = removeElement(new int[]{3,2,2,3}, 3);
  System.out.println(res);
}

private static int removeElement(int[] nums, int val) {
  int p = 0;
  for (int i = 0; i < nums.length; i++) {
    if(nums[i] != val) {
      nums[p++] = nums[i];
    }
  }
  return p;
}