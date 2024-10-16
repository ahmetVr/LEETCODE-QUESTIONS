public class Test3Sum {
    public static void main(String[] args) {
        SumThree test = new SumThree();

        int[] nums1 = {-1,0,1,2,-1,-4};
        int[] nums2 = {0,1,1};
        int[] nums3 = {0,0,0};

        System.out.println(test.threeSum(nums1));
        System.out.println(test.threeSum(nums2));
        System.out.println(test.threeSum(nums3));
    }
}
