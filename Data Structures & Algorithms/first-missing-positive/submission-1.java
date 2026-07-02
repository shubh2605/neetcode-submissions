class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        int num=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                num=i+1;
                break;
            }
        }
        if(num==Integer.MIN_VALUE)return nums.length+1;
        return num;
    }
}