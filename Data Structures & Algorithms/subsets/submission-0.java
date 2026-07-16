class Solution {
    private void parts(List<List<Integer>> ls,List<Integer> dub,int i,int nums[]){
        if(i==nums.length){
            ls.add(new ArrayList<>(dub));
            return;
        }
        dub.add(nums[i]);
        parts(ls,dub,i+1,nums);
        dub.remove(dub.size()-1);
        parts(ls,dub,i+1,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        // List<Integer> dub=new Array
        parts(ls,new ArrayList<>(),0,nums);
        return ls;
    }
}
