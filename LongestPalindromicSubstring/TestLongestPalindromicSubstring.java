public class TestLongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();

        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println(test.longestPalindrome(s1));
        System.out.println(test.longestPalindrome(s2));
    }

}
