/**

 Given an array and a value, remove all instances of that value in-place and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array
 in-place with O(1) extra memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:

 Given nums = [3,2,2,3], val = 3,

 Your function should return length = 2, with the first two elements of nums being 2.

 */

package main.java;

public class RemoveElementFromArray {
  public int removeElement(int[] nums, int val) {
    int len = nums.length;
    if (len == 0)
      return 0;

    int count = 0;
    boolean swapped = false;

    for (int i=0; i<len; i++){
      if (nums[i] == val){
        int j = len-1;
        while (j>i){
          if (nums[j] != val){
            nums[i] = nums[j];
            nums[j] = val;
            swapped = true;
            break;
          }
          --j;
        }
        if (swapped){
          ++count;
          swapped = false;
        }
        else
          break;
      }
      else
        ++count;
    }
    return count;
  }
}
