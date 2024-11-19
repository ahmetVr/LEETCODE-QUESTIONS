package MergeSortedArray;

public class TestMergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;


        int[] nums3 = {1};
        int m1 = 1;
        int[] nums4 = {};
        int n1 = 0;

        MergeSortedArray test = new MergeSortedArray();
        test.merge(nums1, m, nums2, n);

        test.merge(nums3, m1, nums4, n1);

        for(int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        } // 1-2-2-3-5-6

        System.out.println();

        for(int i = 0; i < nums3.length; i++) {
            System .out.print(nums3[i] + " ");
        }// 1
    }
}
