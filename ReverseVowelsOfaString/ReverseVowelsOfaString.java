package ReverseVowelsOfaString;



/*
 Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */

public class ReverseVowelsOfaString {
    public String reverseVowels(String s) {
        char[] res = s.toCharArray();
        int start = 0, end = s.length() -1;

        while(start < end) {
            if(checkVowel(s.charAt(start)) && checkVowel(s.charAt(end))) {
                char tmp = res[start];
                res[start] = res[end];
                res[end] = tmp;
                start++; 
                end--;
            } else if(!checkVowel(s.charAt(start))) {
                start++;
            } else {
                end--;
            }
        }
        return new String(res);
    }

    public boolean checkVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
        ) {
            return true;
        }
        return false;
    }
}




