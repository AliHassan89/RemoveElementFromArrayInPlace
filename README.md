# RemoveElementFromArrayInPlace
Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array
 in-place with O(1) extra memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:

 Given nums = [3,2,2,3], val = 3,

 Your function should return length = 2, with the first two elements of nums being 2.
 
 # Solution:

1. An int array and an int target value is received as function parameter.

2. Loop through the array starting from 0th index and look for target value.

3. when we find a match we should swap the value of i'th index with the value from end of the array.

4. If the end of array also has target value then we start decreasing from the end of array until we find a place which is not equal to target and swap the values. For this reason there is another inner loop.

5. Whenever we swap the value we increment the count.

6. In the end return count which is the length of new array.
