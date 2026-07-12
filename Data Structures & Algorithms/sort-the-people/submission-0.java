class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int arr[][]=new int[heights.length][2];
        for(int i=0;i<heights.length;i++){
            arr[i][0]=heights[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[0],a[0]));
        String name[]=new String[names.length];
        for(int i=0;i<name.length;i++){
            name[i]=names[arr[i][1]];
        }
        for(int i=0;i<name.length;i++){
            names[i]=name[i];
        }
        return names;
    }
}