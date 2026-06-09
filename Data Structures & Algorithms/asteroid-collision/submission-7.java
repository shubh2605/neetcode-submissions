class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            if(s.isEmpty()){
                s.push(asteroids[i]);
            }else if(s.peek()>0 && asteroids[i]<0){
                
                    while(!s.isEmpty() && s.peek()>0 && Math.abs(asteroids[i])>s.peek()){
                        s.pop();
                    }
                    if(s.isEmpty() || s.peek()<0)s.push(asteroids[i]);
                    else if(Math.abs(asteroids[i])==s.peek())s.pop();
            }else{
                s.push(asteroids[i]);
            }
        }
        
        int arr[]=new int[s.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=s.pop();
        }
        return arr;
    }
}