package com.problems;
//6. Zigzag Conversion - https://leetcode.com/problems/zigzag-conversion/
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String convert(String s, int numRows) {
        Map<Integer,String> map=new HashMap<>();
        int ptr=0;
        int col=-1;
        boolean flag=false;
        if(numRows<2){
            return s;
        }
        while(ptr<s.length() && !flag){
            col++;
            //fill entire col
            for(int row=0;row<numRows;row++){
                if(ptr<s.length() && col<s.length()){
                    char c=s.charAt(ptr++);
                    if(map.containsKey(row)){
                        map.put(row,map.get(row)+c);
                    }
                    else{
                        map.put(row,""+c);
                    }
                }
                else{
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
            //fill diagonal
        
            col++;
            for(int i=numRows-2;i>0;i--){
                if(ptr<s.length()  && col<s.length()){
                    char c=s.charAt(ptr++);
                    if(map.containsKey(i)){
                        map.put(i,map.get(i)+c);
                    }
                    else{
                        map.put(i,""+c);
                    }
                }
                else{
                    flag=true;
                    break;
                }
            }
            
            
        }
        String ans="";
        for(int i=0;i<numRows;i++){
            if(map.get(i)!=null){
                ans+=map.get(i);
            }
        }
        return ans;
    }
}