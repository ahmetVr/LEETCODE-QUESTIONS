public class TestMaximumSubarray {
    public static void main(String[] args) {
        MaximumSubarray test = new MaximumSubarray();

        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};

        System.out.println(test.maxSubArray(nums1));
        System.out.println(test.maxSubArray(nums2));
        System.out.println(test.maxSubArray(nums3));
    }

}
