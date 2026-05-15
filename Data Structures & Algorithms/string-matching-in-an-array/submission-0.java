/*
You are given an array of string words, return all strings in words that are a substring of another word. You can return the answer in any order.

Note: A substring is a contiguous non-empty sequence of characters within a string.

Example 1:

Input: words = ["mass","as","hero","superhero"]

Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero". ["hero","as"] is also a valid answer.

Example 2:

Input: words = ["neetcode","neeet","neet","code"]

Output: ["neet","code"]
Explanation: "neet" and "code" are substrings of "neetcode".

Example 3:

Input: words = ["blue","green","bu"]

Output: []
Explanation: No string of words is substring of another string.

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 30
words[i] contains only lowercase English letters.
All the strings of words are unique.
*/
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }

                if (words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }

        return res;
    }
}