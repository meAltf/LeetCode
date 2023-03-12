/******************************************************************************************************************************************************
------------------
Level-Easy
Question No-566
-------------------
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

---------------------------------------------------------------------------------------

Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c){
            return mat;
        }
      
        int rshape[][] = new int [r][c];
        
         for (int i = 0;
             i < c*r; i++) {
 

            int row1 = i / mat[0].length;
            int col1 = i % mat[0].length;
            int row2 = i / c;
            int col2 = i % c;

            rshape[row2][col2] = mat[row1][col1];
            
        }
       
        return rshape;
    }
}
