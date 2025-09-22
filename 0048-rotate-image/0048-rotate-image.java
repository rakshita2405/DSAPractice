class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
          // Step 1: Transpose (only upper triangle)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // j starts from i
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
           int left=0;
                int right=n-1;
                while(left<right){
                    int temp=matrix[i][left];
                    matrix[i][left]=matrix[i][right];
                    matrix[i][right]=temp;
                    left++;
                    right--;
                
            }
        }

    }
}