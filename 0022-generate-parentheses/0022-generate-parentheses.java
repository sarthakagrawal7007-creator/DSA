class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<Character> c=new Stack<>();
      return solve(c,n);
    }
    public static boolean isValid(String str){
        Stack<Character> c=new Stack<>();
        for (char ch:str.toCharArray()){
            if (ch=='('){
                c.push(ch);
            }else if (ch==')'){
                if(c.isEmpty()){
                    return false;
                }
                c.pop();
            }
        }
        return c.isEmpty();
    }
    public static List<String> solve(Stack<Character> curr, int n) {
        List<String> result = new ArrayList<>();

        if (curr.size() == 2 * n) {

            StringBuilder str = new StringBuilder();

            for (char ch : curr) {
                str.append(ch);
            }

            if (isValid(str.toString())) {
                result.add(str.toString());
            }

            return result;
        }

        curr.push('(');
        result.addAll(solve(curr, n));
        curr.pop();

        curr.push(')');
        result.addAll(solve(curr, n));   // important
        curr.pop();
        return result;
    }
}