package MajorityElement;

import java.util.Arrays;

/*
 *Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

public class MajorityElement {
     public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int check = 0;

        for(int num : nums) {
            if(count == 0) {
                check = num;
            }

            if(check == num) {
                count++;
            } else {
                count--;
            }
        }
        return check;
    }
}
