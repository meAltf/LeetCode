/******************************************************************************************************************************************************
------------------------
QUESTION NO-1523
LEVEL- EASY
-----------------------  --
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

---------------------------------------------------------------------------------------

Example 1:

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
Example 2:

Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/
-----------------
APPROACH-1
-----------------

class Solution {
    public int countOdds(int low, int high) {
        
        int count=0;
        for(int i=low;i<=high;i++){
            if(i%2!=0) count++;
        }
        return count;
    }
}

-----------------
APPROACH-2
-----------------
  
class Solution {
    public int countOdds(int low, int high) {
        
        int count =0;

        if(low %2 ==0 && high %2 ==0) count = (high-low)/2;

       // else (low %2 !=0 && high %2 !=0) count = (high-low)/2 + 1;

        else count = (high-low)/2 + 1;

        return count;
    }
}
