class Solution {
    public boolean isValid(String s) {
        Stack<Character> set = new Stack<>();

        for(int c : s.toCharArray()){
            if(c == '['){
               set.push(']');
            }
            else if(c == '{'){
                set.push('}');
            }
            else if(c == '('){
                set.push(')');
            }
            else if(set.isEmpty() || set.pop() != c){
                return false;
            }
        }
        return set.isEmpty();
    }
}