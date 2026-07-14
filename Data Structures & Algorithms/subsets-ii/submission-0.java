class Solution {
    public static void Backtracking(int nums[],int index,List<List<Integer>> ls,List<Integer> dub){
        if(index==nums.length){
            if(!ls.contains(dub))ls.add(new ArrayList<>(dub));
            return;
        }
        dub.add(nums[index]);
        Backtracking(nums,index+1,ls,dub);
        dub.remove(dub.size()-1);
        Backtracking(nums,index+1,ls,dub);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> dub = new ArrayList<>();
        int index=0;
        Arrays.sort(nums);
        Backtracking(nums,index,ls,dub);
        return ls;
    }
}