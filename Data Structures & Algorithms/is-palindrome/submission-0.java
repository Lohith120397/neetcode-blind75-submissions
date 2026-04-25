class Solution {
    public boolean isPalindrome(String s) {
         int i = 0;
        int j = s.length() - 1;
        String lowerCase = s.toLowerCase();
        while(i <= j)
        {
            char iChar = lowerCase.charAt(i);
            char jChar = lowerCase.charAt(j);
            if((!Character.isLetter(iChar) && !Character.isDigit(iChar)))
                i++;
            else if((!Character.isLetter(jChar) && !Character.isDigit(jChar)))
                j--;
            else if(iChar != jChar)
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
