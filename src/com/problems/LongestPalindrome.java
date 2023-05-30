package com.problems;
//5. Longest Palindromic Substring - https://leetcode.com/problems/longest-palindromic-substring/description/
class LongestPalindrome {
	public String solve2(String s) {
	    if (s == null || s.length() < 1) return "";
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
	    
	    public String solve(String str,int i,int j,String left,String right,String[][] dp){
	        if(i==j){
	            return left+str.charAt(i)+right;
	        }
	        if(i>j){
	            return left+right;
	        }
	        if(dp[i][j]!=null){
	            return dp[i][j];
	        }
	        String ans="";
	        if(str.charAt(i)==str.charAt(j)){
	            ans=solve(str,i+1,j-1,left+str.charAt(i),str.charAt(j)+right,dp);
	        }
	        String ans1=solve(str,i+1,j,"","",dp);
	        String ans2=solve(str,i,j-1,"","",dp);  
	        String ss=ans1.length()>ans2.length()?ans1:ans2;
	        ans=ss.length()>ans.length()?ss:ans;
	        return dp[i][j]=ans;
	    }
	    
	    
	    public String longestPalindrome(String str) {
	        return solve2(str);
	    }
}
