package com.problems;
//7. Reverse Integer - https://leetcode.com/problems/reverse-integer/description/
public class Reverse {
	public int reverse(int x) {
        long ans=0;
        boolean isN=x<0;
        x=Math.abs(x);
        while(x>0){
            ans=ans*10+x%10;
            x=x/10;
        }
        if(ans>Integer.MAX_VALUE){
            return 0;
        }
        if(isN){
            ans=ans*(-1);
        }
        return (int)ans;
	}
}
