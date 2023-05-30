package com.problems;
//4. Median of Two Sorted Arrays - https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class FindMedianSortedArrays {
	public double findMedianSortedArrays(int[] num1, int[] num2) {
        //first step is to merge the array
        int s1=0;
        int s2=0;
        int[] arr=new int[num1.length+num2.length];
        int ptr=0;
        while(s1<num1.length && s2<num2.length){
            if(num1[s1]<num2[s2]){
                arr[ptr++]=num1[s1];
                s1++;
            }
            else{
                arr[ptr++]=num2[s2];
                s2++;
            }  
        }
        
        while(s1<num1.length){
            arr[ptr++]=num1[s1];
            s1++;
        }
        
         while(s2<num2.length){
            arr[ptr++]=num2[s2];
            s2++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         // System.out.println(arr.length);
        if((arr.length)%2==0){
            
            int mid=(arr.length)/2;
           System.out.println(mid);
            return (arr[mid-1]+arr[mid])/2.0;
        }
        else{
            int mid=((arr.length)/2);
            return arr[mid];
        }
        
    }
}

