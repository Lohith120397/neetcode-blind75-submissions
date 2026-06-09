
/*
Maximum Number of Balloons
Easy
Topics
Company Tags
You are given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:

Input: text = "nlaebolko"

Output: 1
Example 2:

Input: text = "loonbalxballpoon"

Output: 2
Example 3:

Input: text = "neetcode"

Output: 0
Constraints:

1 <= text.length <= 10,000
text consists of lower case English letters only.
*/
class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : text.toCharArray()) {
            if ("balon".indexOf(c) != -1) {
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }
        }

        if (mp.size() < 5) {
            return 0;
        }

        mp.put('l', mp.get('l') / 2);
        mp.put('o', mp.get('o') / 2);
        return Collections.min(mp.values());
    }
}