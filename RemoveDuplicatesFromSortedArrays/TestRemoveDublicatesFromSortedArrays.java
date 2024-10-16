public class TestRemoveDublicatesFromSortedArrays {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrays test = new RemoveDuplicatesFromSortedArrays();
       
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; 
        int[] nums2 = {1,1,2};
        System.out.println(test.removeDuplicates(nums));
        System.out.println(test.removeDuplicates(nums2));
    }
}
