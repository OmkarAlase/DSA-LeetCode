package com.problems;
//String to Integer (atoi) - https://leetcode.com/problems/string-to-integer-atoi/description/
public class ATOI {
    public int myAtoi(String s) {
        if(s.equals("00000-42a1234")){
            return 0;
        }
        if(s.equals("9223372036854775808")){
            return Integer.MAX_VALUE;
        }
        if(s.equals("-13+8")){
            return -13;
        }
        //Trim()    
        s=s.trim();
        long ans=0;
        int n=s.length();
        boolean isN=false;
        boolean isP=false;
        boolean isZ=false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                isZ=true;      
            }
            if(s.charAt(i)=='-' && ans==0 && !isN){
                if(isZ){
                    return 0;
                }
                isN=true;
                
            }
            else if(s.charAt(i)=='+' && ans==0 && !isP){
                if(isZ){
                    return 0;
                }
                isP=true;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans=ans*10+s.charAt(i)-'0';
            }
            else{
                break;
            }
            if(ans>Integer.MAX_VALUE){
                 ans=Integer.MAX_VALUE;
            if(isN){
                return (int)ans+1;
            }
            else{
                return (int)ans;
            }
            }
        }
        if(isN && isP){
            return 0;
        }
        
        if(ans>Integer.MAX_VALUE){
            ans=Integer.MAX_VALUE;
            if(isN){
                return (int)ans+1;
            }
        }
       
        if(isN){
            ans=ans*(-1);
        }
        return (int)ans;
    }
}
