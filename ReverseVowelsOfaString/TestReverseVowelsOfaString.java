package ReverseVowelsOfaString;

public class TestReverseVowelsOfaString {
    public static void main(String[] args) {
        ReverseVowelsOfaString test = new ReverseVowelsOfaString();
        String s1 = "IceCreAm";
        String s2 = "leetcode";

        System.out.println(test.reverseVowels(s1));
        System.out.println(test.reverseVowels(s2));
    }
}
