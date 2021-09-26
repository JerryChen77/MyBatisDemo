package com.projectDemo.pojo;

/**
 * @author Cjl
 * @date 2021/7/5 21:05
 */
public class aaaa {

        public static int removeDuplicates(int[] nums) {
            int i = 1;
            for(int j=1;j<nums.length;j++){
                if(nums[i-1]!=nums[j]){
                    nums[i]=nums[j];
                    i++;
                }
            }
            return i;
        }
        public static void main(String [] args){
            int[] nums={1,2,3,3,4,4,5,5,6};
            int n =removeDuplicates(nums);
            System.out.println(n);
            for (int num : nums) {
                System.out.print(num+"\t");
            }
        }
    }

