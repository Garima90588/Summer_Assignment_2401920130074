class Solution {
    public int diagonalSum(int[][] mat) {

        int s=mat.length;
        int sum=0;

        for(int i=0;i<s;i++)
        {
            sum=sum+mat[i][i]+mat[i][s-1-i];
        }
        if(s%2!=0)
        {
            return sum-mat[s/2][s/2];
        }

        return sum;
        
    }
}
