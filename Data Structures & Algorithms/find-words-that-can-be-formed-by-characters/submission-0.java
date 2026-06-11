/*
Find Words That Can Be Formed by Characters
Easy
Topics
Company Tags
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once for each word in words).

Return the sum of lengths of all good strings in words.

Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"

Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"

Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

Constraints:

1 <= words.length <= 1000
1 <= words[i].length, chars.length <= 100
words[i] and chars consist of lowercase English letters.
*/
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for (char c : chars.toCharArray()) {
            count[c - 'a']++;
        }

        int[] org = count.clone();
        int res = 0;

        for (String w : words) {
            boolean good = true;
            for (int i = 0; i < w.length(); i++) {
                int j = w.charAt(i) - 'a';
                count[j]--;
                if (count[j] < 0) {
                    good = false;
                    break;
                }
            }
            if (good) {
                res += w.length();
            }
            for (int i = 0; i < 26; i++) {
                count[i] = org[i];
            }
        }
        return res;
    }
}