package org.example;

public class MaxProductSubarraySum {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,0};
        int n = nums.length;
        int res = nums[0];
        for(int i =0;i<n;i++){
            int p = nums[i];
            for(int j = i+1;j<n;j++){
                res = Math.max(res,p);
                p *= nums[j];
            }
        }

        int result = optimizeMethod(nums,n);
        System.out.println(result);
        System.out.println(res);
    }

    private static int optimizeMethod(int[] nums, int n) {

        int pre=1,suf= 1;
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(pre == 0 ) pre = 1;
            if(suf ==0 ) suf = 1;
            pre *= nums[i];
            suf *= nums[n-i-1];
            ans = Math.max(ans,Math.max(pre,suf));
        }
        return ans;
    }
}
