/******************************************************************************************************************************************************
---------------------------
Level- Easy
Question No- 1290
------------------------------
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. 
The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

---------------------------------------------------------------------------------------
 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {

        ListNode temp = head;
        int ans = 0;

        while(temp != null){

            ans =  (ans<<1) + temp.val;
            temp = temp.next;

        }
        return ans;
 
    }
}

// i'm using left shift operator because, if you do left shift a number by one it means you multiply that number with 2'
