package Algorithm.Java.ContainerWithMostWater;

public class TestContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater test = new ContainerWithMostWater();
        
        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};
        
        System.out.println(test.maxArea(height));
        System.out.println(test.maxArea(height2));
    }
}
