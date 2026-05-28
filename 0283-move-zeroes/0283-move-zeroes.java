class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int []temp=new int[n];
        int idx=0;
        for(int num:nums){
            if(num!=0){
                temp[idx++]=num;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}