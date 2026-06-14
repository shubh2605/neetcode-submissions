class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int count=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                st2.push(count);
            }
            else if(st.peek()==ch){
                count++;
                st.push(ch); 
                st2.push(count);
                if(count==k){
                    while(count>0){
                        st.pop();
                        st2.pop();
                        count--;
                    }
                    count=st2.isEmpty()?1:st2.peek();
                }
            }else{
                count=1;
                st.push(ch);
                st2.push(count);
                
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty())sb.append(st.pop());
        return sb.reverse().toString();
    }
}