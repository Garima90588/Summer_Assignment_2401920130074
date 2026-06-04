class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int [][] arr =new int[r][c];
        if(n*m!=r*c)
           return mat;
        int i=0,j=0;
        for(int[] nums : mat)
        {
           for(int num:nums)
           {
              arr[i][j]=num;
              j++;
              if(j==c)
              {
                j=0;
                i++;
                
              }
           }
        }
        return arr;
        
    }
}
