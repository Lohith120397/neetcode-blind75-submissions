class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs)
        {
            String frequencyString = generateFrequencyOfString(str);

            if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(str);
            } else {
                List<String> values = new ArrayList<>();
                values.add(str);
                map.put(frequencyString, values);
            }
        }

        return new ArrayList<>(map.values());
    }

     public static String generateFrequencyOfString(String str) {

        //Frequency Bucket
        int[] frequency = new int[26];

        //Iterate over character
        for (char c : str.toCharArray()) {
            frequency[c - 'a']++;
        }

        //Start creating the frequency string
        StringBuilder builder = new StringBuilder();
        char c = 'a';
        for (int i : frequency) {
            builder.append(c);
            builder.append(i);
            c++;
        }

        return builder.toString();
    }
}
