import java.io.LineNumberInputStream;

public class TestLongestSubstringWithoutCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutCharacters test = new LongestSubstringWithoutCharacters();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(test.lengthOfLongestSubstring(s1));
        System.out.println(test.lengthOfLongestSubstring(s2));
        System.out.println(test.lengthOfLongestSubstring(s3));
    }
}
