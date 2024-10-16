package Algorithm.Java.TwoSum;

public class TestTwoSum {
    public static void main(String[] args) {
        TwoSum test = new TwoSum();

        int[] nums1 = {2,7,11,15};
        int target1 = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] ans1 = test.twoSum(nums1, target1);
        int[] ans2 = test.twoSum(nums2, target2);

        for(int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i] + " ");
        }

        System.out.println();
        
        for(int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i] + " ");
        }

        
        

        
    }
}
