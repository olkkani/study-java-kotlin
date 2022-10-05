import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c1 ) {
                stack.pop();
            }else {
                stack.push(c1);
            }
        }

        answer = stack.size() == 0 ? 1 : 0;
        return answer;
    }
}