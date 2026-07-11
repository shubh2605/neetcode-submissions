class Solution {
    private void permutation(List<List<Integer>> ls,List<Integer> dub,int nums[]){
        if(nums.length==0){
            ls.add(new ArrayList<>(dub));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            dub.add(nums[i]);
            int temp[]=new int[nums.length-1];
            int k=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j)temp[k++]=nums[j];
                
            }
            permutation(ls,dub,temp);
            dub.remove(dub.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls=new ArrayList<>();
        permutation(ls,new ArrayList<>(),nums);
        return ls;
    }
}