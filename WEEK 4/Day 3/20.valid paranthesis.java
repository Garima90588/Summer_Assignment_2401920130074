class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
      Stack <Character> st = new Stack<>();
      int i=0;
      while(i<s.length())
      {
        if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
        {
            st.push(s.charAt(i));
            i++;
        }
        else
        {
            if(st.isEmpty()) return false;
            if(s.charAt(i)==')' && st.peek()=='(') st.pop();
            else if(s.charAt(i)==']' && st.peek()=='[') st.pop();
            else if(s.charAt(i)=='}' && st.peek()=='{') st.pop();
            else return false;
            i++;
        }
      } 
      if(st.size()==0) return true;
      return false; 
    }
}
