/******************************************************************************************************************************************************
------------------
QUESTION NO-1491
LEVEL- EASY
-------------------

You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
---------------------------------------------------------------------------------------

Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/
--------------------
APPROACH-1
---------------------
class Solution {
    public double average(int[] salary) {
        
        Arrays.sort(salary);

        double averageSum = 0;

        for(int i=1; i<salary.length-1; i++){
            averageSum += salary[i];
        }

        return (averageSum/(salary.length-2));
    }
}

---------------------
APPROACH-2
---------------------
  
class Solution {
    public double average(int[] salary) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double avg = 0;

        for(int i=0; i<salary.length; i++){

            if(salary[i] > max) max = salary[i];

            if(salary[i] < min) min = salary[i];

            avg += salary[i];
        }

        avg = avg - (max + min);

        return avg/(salary.length-2);
    }
}
