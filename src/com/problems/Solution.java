package com.problems;
//1. Two Sum - https://leetcode.com/problems/two-sum/ 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for(int key : map.keySet()){
            if(map.containsKey(target - key)){
                if(target - key == key){
                    int a = map.get(key).get(0);
                    int b = map.get(key).get(1);
                    return new int[]{a,b};
                }
                return new int[]{map.get(key).get(0),map.get(target - key).get(0)};
            }
        }

        return new int[]{0,0};
    }
}