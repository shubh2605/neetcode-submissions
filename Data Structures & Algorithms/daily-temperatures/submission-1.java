class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<temperatures.length-1;i++){
            int count=0;
            int j=i;
            while(j<temperatures.length && temperatures[j]<=temperatures[i]){
                if(j==temperatures.length-1 && temperatures[j]<=temperatures[i]){
                    count=0;
                    break;
                }
                count++;
                j++;
            }
        s.push(count);
        }
        s.push(0);
        int arr[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            arr[i]=s.pop();
        }
        return arr;
    }
}
