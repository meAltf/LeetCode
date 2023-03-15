/******************************************************************************************************************************************************
-------------------
Level- Easy
Question No-242
-------------------
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

---------------------------------------------------------------------------------------
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a,b);

        if(result==true) return true;

        return false;
    }
}
