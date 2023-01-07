class Solution {
    public boolean isValid(String s) {
        
        // convert the input string into a character array
        // create a stack 
        // for every opening bracket, push a closing bracket onto the stack
        // when current peek doesn't match the character it means the stack is no longer valid
        // stack should not be empty before reaching the end of the character array
        
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack();
        
        for(char c : arr) {
            if(c == '(') {
                stack.push(')');
            } else if(c == '[') {
                stack.push(']');
            } else if(c == '{') {
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}