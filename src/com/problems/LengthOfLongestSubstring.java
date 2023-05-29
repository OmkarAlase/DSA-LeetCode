package com.problems;
//3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
         int st=0;
        int e=0;
        int n=s.length();
        int ans=0;
        Set<Character> set=new HashSet<>();
        if(s.length()==1){
            return 1;
        }
        while(e<n && st<n){
            char ec=s.charAt(e);
            char sc=s.charAt(st);
           if(set.contains(ec)){
               ans=Math.max(ans,e-st);
               set.remove(sc);
               st++;
           }
            else{
                set.add(ec);
                e++;
            }
        }
        ans=Math.max(ans,set.size());
        return ans;
    }
}
