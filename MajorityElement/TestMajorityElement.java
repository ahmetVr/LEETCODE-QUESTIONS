package MajorityElement;

public class TestMajorityElement {
    public static void main(String[] args) {
        MajorityElement test = new MajorityElement();

        int[] nums1 = {2,2,1,1,1,2,2};
        int[] nums2 = {3,2,3};

        System.out.println(test.majorityElement(nums1));
        System.out.println(test.majorityElement(nums2));

    }
}
