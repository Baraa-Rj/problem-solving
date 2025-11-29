class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i=0;
        for(char c : s.toCharArray()){
            switch(c){
                case '(':
                case '{':
                case '[':
                stack.push(c);
                break;
                case '}':
                case ')':
                case ']':
                if(stack.isEmpty())
                return false;
                if(!((stack.pop() == '{'&& c=='}') || (stack.pop() == '('&&c==')')||(stack.pop() == '['&&c==']')))
                return false;
            }

        }
        return true;
    }
}
