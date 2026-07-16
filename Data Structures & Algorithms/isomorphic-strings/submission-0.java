class Solution {
    public boolean isIsomorphic(String s, String t) {
        int map1[]=new int[256];
        int map2[]=new int[256];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char sh=t.charAt(i);
            if(map1[ch]!=map2[sh])return false;
            map1[ch]=i+1;
            map2[sh]=i+1;
        }
        return true;
    }
}