package ThirdMaximumNumber;

public class TestThirdMaximumNumber {
    public static void main(String[] args) {
        ThirdMaximumNumber test = new ThirdMaximumNumber();

        int[] nums1 = {3,2,1};
        int[] nums2 = {1,2};

        System.out.println(test.thirdMax(nums1));
        System.out.println(test.thirdMax(nums2));
    }
}
