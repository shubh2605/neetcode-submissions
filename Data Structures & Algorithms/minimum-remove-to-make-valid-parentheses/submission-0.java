class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        Set<Integer> invalid=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')st.push(i);
            else if(ch==')'){
                if(st.isEmpty())invalid.add(i);
                else 
                    st.pop();
            }
        }
        while(!st.isEmpty()){
            invalid.add(st.pop());
        }

        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(!invalid.contains(i))sb.append(s.charAt(i));
           
        }
        return sb.toString();
    }
}