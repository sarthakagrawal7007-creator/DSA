class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();    
    }
        public void push(int x) {
            q1.add(x);
        }
        public int pop() {
            int s=-1;
          while (!q1.isEmpty()){
              s=q1.remove();
              if (q1.isEmpty()){
                  break;
              }
              q2.add(s);
          }
            Queue<Integer> temp=new LinkedList<>();
            q1=q2;
            q2=temp;
            return s;
        }

        public int top() {
            int s=-1;
            while (!q1.isEmpty()){
                s=q1.remove();
                q2.add(s);
            }
            Queue<Integer> temp=new LinkedList<>();
            q1=q2;
            q2=temp;
            return s;
        }

        public boolean empty() {
         return q1.isEmpty();
        }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */