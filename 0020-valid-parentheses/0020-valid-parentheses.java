class Solution {
    public boolean isValid(String str) {
         Stack<Character> s=new Stack<>();
       for(char arr:str.toCharArray()){
           if(arr=='(' || arr=='{' || arr=='['){
               s.push(arr);
           }else {
               if (s.isEmpty()){
                   return false;
               } else if((s.peek()=='(' && arr==')')||(s.peek()=='[' && arr==']')||(s.peek()=='{' && arr=='}')){
               s.pop();
           }else {
               s.push(arr);
           }
       }
       }
       return s.isEmpty();
    }
}