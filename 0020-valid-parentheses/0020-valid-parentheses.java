class Solution {
    public boolean isValid(String str) {
         Stack<Character> s=new Stack<>();
       for(char ch:str.toCharArray()){
           if (s.isEmpty()){
               s.push(ch);
           }else if((s.peek()=='(' && ch==')')||(s.peek()=='[' && ch==']')||(s.peek()=='{' && ch=='}')){
               s.pop();
           }else {
               s.push(ch);
           }
       }
       return s.isEmpty();
    }
}