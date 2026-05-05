/*
* Valid Parentheses
Easy
Topics
Company Tags
Hints

You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
Explanation: The brackets are not closed in the correct order.

Constraints:

1 <= s.length <= 1000
* */
class Solution {
    public boolean isValid(String s) {

         boolean isValidParentheses = false;
        if(s.length() == 1)
            return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{')
                stack.push(c);
            else if(!stack.isEmpty() && ((c == ']' && stack.peek() == '[') || (c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{'))) {
                stack.poll();
                isValidParentheses = true;
            } else
                return false;
        }

        if(!stack.isEmpty())
            isValidParentheses = false;

        return isValidParentheses;
    }
}
