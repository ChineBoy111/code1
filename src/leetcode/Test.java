package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
//        System.out.println(romanToInt("III"));
//        System.out.println(isValid("()"));
//        System.out.println(clearDigits("ab34"));
//        System.out.println(clearDigits("abc"));
//        int[] arr= {1,1,2};
//        System.out.println(removeDuplicates(arr));
//         int[] nums= {2, 7, 11, 15};
//         System.out.println(twoSum(nums, 9));
//         System.out.println(strStr("sadbutsad","sad"));


    }
    public static int romanToInt(String s) {
        int res=0;
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);
        for(int i=0;i<s.length();i++) {
            int value=hm.get(s.substring(i,i+1));
            if(i<s.length()-1&&hm.get(s.substring(i,i+1))<hm.get(s.substring(i+1,i+2))){
                res-=value;
            }else{
                res+=value;
            }
        }
        return res;
    }
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> sta=new Stack<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('(',1);
        hm.put(')',4);
        hm.put('{',2);
        hm.put('}',5);
        hm.put('[',3);
        hm.put(']',6);
        if(charArray.length==1) return false;
        for(int i=0;i<charArray.length;i++) {
            int value=hm.get(charArray[i]);
            if(value<=3&&value>=1) sta.push(charArray[i]);
            else{
                if(sta.isEmpty()||hm.get(sta.peek())!=value-3) return false;
                else sta.pop();
            }
        }

        if(sta.isEmpty()) return true;
        return false;
    }
    public static String clearDigits(String s) {
        String res="";
        for(int i=0;i<s.length();i++) {
            if(!Character.isDigit(s.charAt(i))) {
                res+=s.charAt(i);
            }
            else{
                if(!res.isEmpty()){
                    res=res.substring(0,res.length()-1);
                }
            }
        }
        return res;
    }
    public static int removeDuplicates(int[] nums) {
         int k=0;
         int i=1;
         while(i<nums.length) {
             if(nums[i]==nums[k]){
                 i++;
             }else{
                 nums[++k]=nums[i++];
             }
         }

         return k+1;
    }
    public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++) {
                if(hm.containsKey(target-nums[i])){
                    return new int[] {hm.get(target-nums[i]),i};
                }else{
                    hm.put(nums[i],i);
                }
            }
            return null;
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()>=haystack.length()) return haystack.equals(needle)?0:-1;
        for(int i=0;i<haystack.length()-needle.length();i++) {
            String temp=haystack.substring(i,i+needle.length());
            if(temp.equals(needle)) return i;

        }
        return -1;
    }
    public static int strSTr2(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        if (len1 < len2) return -1;
        char[] c1 = haystack.toCharArray(), c2 = needle.toCharArray();
        for (int i = 0; i <= len1 - len2; i++) {
            int a = i, b = 0;
            while (b < len2 && c1[a] == c2[b]) {
                a++;
                b++;
            }
            if (b == len2) return i;
        }
        return -1;
    }
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left =0;
        int right =n-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
    public static int findJudge(int n, int[][] trust) {
        int[] out=new int[n+1];
        int[] in=new int[n+1];
        for(int[]arr:trust){
            out[arr[0]]=out[arr[0]]+1;
            in[arr[1]]=in[arr[1]]+1;
        }
        for(int i=1;i<=n;i++) {
            if(out[i]==0&&in[i]==n-1) return i;
        }
        return -1;
    }


}
