class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }else{
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }
    private boolean isPalindrome(String s,int st,int end){
        while(st<end){
            if(s.charAt(st++)!=s.charAt(end--))return false;
        }
        return true;
    }
}