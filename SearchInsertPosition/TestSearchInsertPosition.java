package SearchInsertPosition;

public class TestSearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition test = new SearchInsertPosition();
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int[] nums2 = {1,3,5,6};
        int target2 = 2;
        int[] nums3 = {1,3,5,6};
        int target3 = 7;

        System.out.println(test.searchInsert(nums3, target3));
        System.out.println(test.searchInsert(nums2,target2));
        System.out.println(test.searchInsert(nums1, target1));
    }
}
