class Solution {
    private void permutation(int[] nums,List<List<Integer>> ls,List<Integer> dub){
        if(nums.length==0){
            ls.add(new ArrayList<>(dub));
            return;
        }
        for(int i=0;i<nums.length;i++){
            dub.add(nums[i]);
            int temp[]=new int[nums.length-1];
            int k=0;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    temp[k++]=nums[j];
                }
            }
            permutation(temp,ls,dub);
            dub.remove(dub.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        permutation(nums,ls,new ArrayList<>());
        return ls;
    }
}
