public class TestLargestValuesFromLabels {
    public static void main(String[] args) {
        int[] values = {5,4,3,2,1};
        int[] labels = {1,1,2,3};
        int useLimit = 1;
        int numWanted = 3;

        LargestValuesFromLabels test = new LargestValuesFromLabels();
        System.out.println(test.largestValsFromLabels(values, labels, numWanted, useLimit));
    }
}
