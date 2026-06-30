class Solution {
    public int[][] generateMatrix(int n) {
        int a=1;
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
	        int row=i;
	        int col=n-i-1;
	        for(int j=row;j<=col;j++){
		        mat[row][j]=a++;
	        }
	        for(int j=row+1;j<=col;j++){
	    	    mat[j][col]=a++;
	        }
	        for(int j=col-1;j>=row;j--){
		        mat[col][j]=a++;
	        }
	        for(int j=col-1;j>=row+1;j--){
		        mat[j][row]=a++;
	        }
        }
        return mat;	
    }
}