class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                List<Character> list = new ArrayList<>();
                while(stack.peek() != '('){
                    list.add(stack.pop());
                }
                stack.pop();
                for(char c : list){
                    stack.push(c);
                }
            }else{
                stack.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : stack) res.append(ch);
        return res.toString();
    }

}