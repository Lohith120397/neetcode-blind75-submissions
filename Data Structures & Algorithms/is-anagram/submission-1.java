class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag  = false;
        HashMap<Character, Integer> charCount = new HashMap<>(); //This will store character with its count.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            }
            else
                charCount.put(c, 1);
        }

        HashMap<Character, Integer> charCount2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(charCount2.containsKey(c)) {
                charCount2.put(c, charCount2.get(c) + 1);
            }
            else
                charCount2.put(c, 1);
        }

        if(charCount2.size() == charCount.size())
        {
            for (Map.Entry<Character, Integer> entry : charCount.entrySet())
            {
                if(charCount.containsKey(entry.getKey()) && Objects.equals(charCount.get(entry.getKey()), charCount2.get(entry.getKey())))
                    flag = true;
                else
                    return false;

            }
        }
        return flag;
    }
}
